package org.rain.oauth2.server.entity;

import javax.persistence.*;

@Table(name = "tb_user_role")
public class TbUserRole {
    @Id
    private Long id;

    /**
     * �û� ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * ��ɫ ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�û� ID
     *
     * @return user_id - �û� ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * �����û� ID
     *
     * @param userId �û� ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ��ɫ ID
     *
     * @return role_id - ��ɫ ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * ���ý�ɫ ID
     *
     * @param roleId ��ɫ ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}