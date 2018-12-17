package com.itheima.dao;

import com.itheima.domain.User;

public interface UserMapper {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Integer saveUser(User user);

    /**
     * 通过用户名查询
     * @param username
     * @return
     */
    public User findByUsername(String username);
}
