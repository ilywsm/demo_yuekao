package com.liuxu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "t_detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String sid;
    private  String sname;
    private  String guige;
    private  Integer num;
    private  String shouzhi;
    private  String songzhi;
    private  Integer ytianshu;
    private  Integer stianshu;
    private  String beizhu;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sid",referencedColumnName = "id",insertable = false,updatable = false)
    private  Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getShouzhi() {
        return shouzhi;
    }

    public void setShouzhi(String shouzhi) {
        this.shouzhi = shouzhi;
    }

    public String getSongzhi() {
        return songzhi;
    }

    public void setSongzhi(String songzhi) {
        this.songzhi = songzhi;
    }

    public Integer getYtianshu() {
        return ytianshu;
    }

    public void setYtianshu(Integer ytianshu) {
        this.ytianshu = ytianshu;
    }

    public Integer getStianshu() {
        return stianshu;
    }

    public void setStianshu(Integer stianshu) {
        this.stianshu = stianshu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
