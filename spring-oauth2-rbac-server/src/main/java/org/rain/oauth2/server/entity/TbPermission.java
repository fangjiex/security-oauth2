package org.rain.oauth2.server.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_permission")
public class TbPermission {
    @Id
    private Long id;

    /**
     * ��Ȩ��
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * Ȩ������
     */
    private String name;

    /**
     * Ȩ��Ӣ������
     */
    private String enname;

    /**
     * ��Ȩ·��
     */
    private String url;

    /**
     * ��ע
     */
    private String description;

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
     * ��ȡ��Ȩ��
     *
     * @return parent_id - ��Ȩ��
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * ���ø�Ȩ��
     *
     * @param parentId ��Ȩ��
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡȨ������
     *
     * @return name - Ȩ������
     */
    public String getName() {
        return name;
    }

    /**
     * ����Ȩ������
     *
     * @param name Ȩ������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡȨ��Ӣ������
     *
     * @return enname - Ȩ��Ӣ������
     */
    public String getEnname() {
        return enname;
    }

    /**
     * ����Ȩ��Ӣ������
     *
     * @param enname Ȩ��Ӣ������
     */
    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    /**
     * ��ȡ��Ȩ·��
     *
     * @return url - ��Ȩ·��
     */
    public String getUrl() {
        return url;
    }

    /**
     * ������Ȩ·��
     *
     * @param url ��Ȩ·��
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * ��ȡ��ע
     *
     * @return description - ��ע
     */
    public String getDescription() {
        return description;
    }

    /**
     * ���ñ�ע
     *
     * @param description ��ע
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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