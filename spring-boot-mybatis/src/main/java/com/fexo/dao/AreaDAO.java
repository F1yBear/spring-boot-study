package com.fexo.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author F1yBear
 */
@Mapper
public interface AreaDAO {

    /**
     *  给用户存钱
     * @param user        用户
     * @param money    密码
     * @return
     */
    int  saveMoney(@Param("user") String user,@Param("money") Integer money);

    /**
     * @param user
     * @param money
     * @return
     */
    int userMoney(@Param("user") String user, @Param("money") Integer money);
}
