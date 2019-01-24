package com.elasticsearch.controller;

import com.elasticsearch.bean.Massage;
import com.elasticsearch.bean.News;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.cluster.Health;
import io.searchbox.core.Bulk;
import io.searchbox.core.Index;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author F1yBear
 */
@RestController
@Api(description = "ES，创建数据接口类")
public class EsController {

    @Autowired
    private JestClient jestClient;

    @PostMapping(value = "/health")
    @ApiOperation(value = "查询ES集群健康")
    public Massage health() throws IOException {
        Health health = new Health.Builder().build();
        JestResult result = jestClient.execute(health);
        Massage massage = new Massage();
        massage.setCode(200);
        massage.setContent(result.getJsonString());
        return massage;
    }

    @ApiOperation(value = "批量给ES插入数据")
    @PostMapping(value = "/bulkIndex")
    public Massage bulkIndex(String indexName,
                                String typeName,
                                int count) throws IOException {

        List<Index> list = new ArrayList();
        for (int i = 0; i < count; i++) {
            News news = new News();
            list.add(new Index.Builder(news).build());
        }
        Bulk bulk = new Bulk.Builder()
                .defaultIndex(indexName)
                .defaultType(typeName)
                .addAction(list).build();
        JestResult jestResult = jestClient.execute(bulk);
        Massage massage = new Massage();
        massage.setCode(200);
        massage.setContent(jestResult.getJsonString());
        return massage;
    }
}
