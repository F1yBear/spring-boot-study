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

}