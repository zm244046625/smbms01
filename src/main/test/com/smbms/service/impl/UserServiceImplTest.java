package com.smbms.service.impl;

import com.smbms.pojo.User;
import com.smbms.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void findUsers() {
        List<User> users = userService.findUsers();
        for (User u :
                users) {
            System.out.println(u);
        }
    }
}