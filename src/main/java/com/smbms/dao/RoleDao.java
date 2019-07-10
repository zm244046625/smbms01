package com.smbms.dao;

import com.smbms.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    /**
     * 根据id返回role
     * @param id
     * @return
     */
    Role findRoleById(@Param("id") int id);

    List<Role> findAllRoles();
}
