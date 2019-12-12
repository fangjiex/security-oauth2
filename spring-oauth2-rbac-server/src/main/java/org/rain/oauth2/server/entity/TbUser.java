package org.rain.oauth2.server.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    @Id
    private Long id;

    /**
     * �û���
     */
    private String username;

    /**
     * ���룬���ܴ洢
     */
    private String password;

    /**
     * ע���ֻ���
     */
    private String phone;

    /**
     * ע������
     */
    private String email;

    private Date created;

    private Date updated;

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
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * ��ȡ���룬���ܴ洢
     *
     * @return password - ���룬���ܴ洢
     */
    public String getPassword() {
        return password;
    }

    /**
     * �������룬���ܴ洢
     *
     * @param password ���룬���ܴ洢
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * ��ȡע���ֻ���
     *
     * @return phone - ע���ֻ���
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����ע���ֻ���
     *
     * @param phone ע���ֻ���
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * ��ȡע������
     *
     * @return email - ע������
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����ע������
     *
     * @param email ע������
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}