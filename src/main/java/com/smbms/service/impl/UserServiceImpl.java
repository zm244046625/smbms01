package com.smbms.service.impl;

import com.smbms.dao.UserDao;
import com.smbms.pojo.User;
import com.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(rollbackFor = RuntimeException.class)
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 获取所有用户集合
     * propagation 指定事务的传播性
     * isolation 指定事务的隔离级别
     * @return
     */
    @Transactional(readOnly = true,propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public List<User> findUsers() {
        return userDao.findAllUsers();
    }
}
