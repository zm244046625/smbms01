package com.smbms.service;

import com.smbms.pojo.Role;

import java.util.List;

public interface RoleService {

    /**
     * 查询所有role
     * @return
     */
    List<Role> findAllRoles();
}
