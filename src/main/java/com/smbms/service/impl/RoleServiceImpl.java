package com.smbms.service.impl;

import com.smbms.dao.RoleDao;
import com.smbms.pojo.Role;
import com.smbms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAllRoles() {
        return roleDao.findAllRoles();
    }
}
