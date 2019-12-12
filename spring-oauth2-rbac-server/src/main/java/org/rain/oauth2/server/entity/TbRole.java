package org.rain.oauth2.server.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_role")
public class TbRole {
    @Id
    private Long id;

    /**
     * ����ɫ
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * ��ɫ����
     */
    private String name;

    /**
     * ��ɫӢ������
     */
    private String enname;

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
     * ��ȡ����ɫ
     *
     * @return parent_id - ����ɫ
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * ���ø���ɫ
     *
     * @param parentId ����ɫ
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡ��ɫ����
     *
     * @return name - ��ɫ����
     */
    public String getName() {
        return name;
    }

    /**
     * ���ý�ɫ����
     *
     * @param name ��ɫ����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ��ɫӢ������
     *
     * @return enname - ��ɫӢ������
     */
    public String getEnname() {
        return enname;
    }

    /**
     * ���ý�ɫӢ������
     *
     * @param enname ��ɫӢ������
     */
    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
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