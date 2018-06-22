package com.loan.base.service;

import com.loan.base.domain.Logininfo;

import java.util.List;

/**
 * @author : wyman
 * @date : 2018/6/22 10:01
 * description：
 */
public interface ILogininfoService {
    /**
     * 注册
     * @param username
     * @param password
     */
    void register(String username,String password);


    /**
     * 查询
     */
    List<Logininfo> selectAll();

    /**
     * 检查用户名是否重复
     */

    Boolean checkUsername(String username);
}
