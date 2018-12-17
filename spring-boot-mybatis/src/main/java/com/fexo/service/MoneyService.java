package com.fexo.service;

import com.fexo.dao.AreaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author F1yBear
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MoneyService {

    @Autowired
    AreaDAO dao;

    public void saveMoney(String user, Integer money) {
        dao.saveMoney(user, money);
    }

    /**
     * @param from
     * @param to
     * @param money
     */
    public void toMoney(String from, String to, Integer money) {
        int m = -money;
        dao.userMoney(from, m);
        dao.userMoney(to, money);
    }
}
