package com.smbms.service;

import com.smbms.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户的集合
     * @return
     */
    List<User> findUsers();
}
