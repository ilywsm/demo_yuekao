package com.liuxu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String wid;
    private  String name;
    private  Integer phone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date shouDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date faDate;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "order")
    private List<Detail> details;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getShouDate() {
        return shouDate;
    }

    public void setShouDate(Date shouDate) {
        this.shouDate = shouDate;
    }

    public Date getFaDate() {
        return faDate;
    }

    public void setFaDate(Date faDate) {
        this.faDate = faDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", wid='" + wid + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", shouDate=" + shouDate +
                ", faDate=" + faDate +
                ", details=" + details +
                '}';
    }
}
