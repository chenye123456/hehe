package com.edu.ls.pojo;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//保护贴膜实体类
@Entity
@Table(name = "mo")
public class Mo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int m_id;//保护贴膜id
    private String m_brand;//适用手机品牌
    private String m_type;//适用手机型号
    private String m_texture;//保护贴膜材质
    private int m_count;//保护贴膜数量
    private float m_price;//保护贴膜价格

    public Mo() {
    }

    public Mo(String m_brand, String m_type, String m_texture, int m_count, float m_price) {

        this.m_brand = m_brand;
        this.m_type = m_type;
        this.m_texture = m_texture;
        this.m_count = m_count;
        this.m_price = m_price;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_brand() {
        return m_brand;
    }

    public void setM_brand(String m_brand) {
        this.m_brand = m_brand;
    }

    public String getM_type() {
        return m_type;
    }

    public void setM_type(String m_type) {
        this.m_type = m_type;
    }

    public String getM_texture() {
        return m_texture;
    }

    public void setM_texture(String m_texture) {
        this.m_texture = m_texture;
    }

    public int getM_count() {
        return m_count;
    }

    public void setM_count(int m_count) {
        this.m_count = m_count;
    }

    public float getM_price() {
        return m_price;
    }

    public void setM_price(float m_price) {
        this.m_price = m_price;
    }
}
