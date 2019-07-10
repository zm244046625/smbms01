package com.smbms.dao;

import com.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserDao {
    /**
     * 分页查询用户数据
     * @param from 查询起始位置
     * @param pageSize 查询页面容量
     * @return
     */
    List<User> findUsersByPage(@Param("from") Integer from,
                               @Param("pageSize") Integer pageSize);
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUsers();

    /**
     * 根据用户名模糊查询
     * @param userName
     * @return
     */
    List<User> findUsersByUserName(@Param("userName") String userName);

    /**
     * 按用户名密码查询
     * @param user
     * @return
     */
    User findUserByUserCodePassword(User user);

    /**
     *
     * @param map
     * @return
     */
    List<User> findUserByMapResult(Map map);

    /**
     *
     * @param user
     * @return
     */
    List<User> findUsersByUserRoleUserName(User user);

    /**
     * 获取指定角色下的用户
     * @param roleName
     * @return
     */
    List<User> findUsersByRoleName(@Param("roleName") String roleName);
    /**
     * 增加用户
     * @param user
     * @return
     */
    int addUser(User user);
    /**
     *更新用户
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(@Param("id") int id);

    /**
     * 获取指定角色下的用户集合 array
     * @param rolesId
     * @return
     */
    List<User> findUserByUserRole(Integer[] rolesId);

    /**
     * 获取指定角色下的用户集合 list
     * @param rolesId
     * @return
     */
    List<User> findUserByUserRoleList(List rolesId);

    /**
     * 获取指定角色下的用户集合 map
     * @param map
     * @return
     */
    List<User> findUserByUserRoleMap(Map map);

    /**
     * 查询用户列表(choose)
     * @param userName
     * @param userRole
     * @param userCode
     * @param creationDate
     * @return
     */
    List<User> getUserList_choose(@Param("userName") String userName,
                                  @Param("userRole") String userRole,
                                  @Param("userCode") String userCode,
                                  @Param("creationDate") Date creationDate);
}
