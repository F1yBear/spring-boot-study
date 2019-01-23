package com.fexo.dao;

import com.fexo.service.MoneyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@Transactional
//@Rollback
public class AreaDAOTest {
    @Autowired
    MoneyService areaDAO;
    @Test
    public void saveMoney() throws Exception {
        areaDAO.saveMoney("wangXiong", 1000000);
    }

    @Test
    public void toMoney() throws Exception {
        areaDAO.toMoney("wangXiong",  "wangFeiXiong", 1000000);
    }

    @Test
    public void money(){
        ExecutorService executorService = new ThreadPoolExecutor(1,10, 60L, TimeUnit.SECONDS,new SynchronousQueue<>());

    }

    @Test
    public void queue() throws InterruptedException {
        PriorityQueue<String> strings = new PriorityQueue <>();
        while (true) {
            strings.add("java");
            strings.add("java1");
            System.out.println(strings.peek());
        }
    }
}