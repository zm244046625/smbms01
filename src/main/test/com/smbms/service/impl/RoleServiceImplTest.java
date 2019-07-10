package com.smbms.service.impl;

import com.smbms.pojo.Role;
import com.smbms.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class RoleServiceImplTest {

    @Autowired
    private RoleService roleService;
    @Test
    public void findAllRoles() {
        List<Role> roles = roleService.findAllRoles();
        for (Role role :
                roles) {
            System.out.println(role);
        }
    }
}