package org.rain.oauth2.server.entity;

import javax.persistence.*;

@Table(name = "tb_role_permission")
public class TbRolePermission {
    @Id
    private Long id;

    /**
     * ��ɫ ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * Ȩ�� ID
     */
    @Column(name = "permission_id")
    private Long permissionId;

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

    /**
     * ��ȡȨ�� ID
     *
     * @return permission_id - Ȩ�� ID
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * ����Ȩ�� ID
     *
     * @param permissionId Ȩ�� ID
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}