package com.liuxu.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class OrderVo<T> {
    private  String wuliu;
    private  String sname;
    private  Integer sphone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date SStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date SendDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date FStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date FendDate;
    private  Integer pageNo;
    private  Integer total;
    private List<T> content;
    public String getWuliu() {
        return wuliu;
    }

    public void setWuliu(String wuliu) {
        this.wuliu = wuliu;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSphone() {
        return sphone;
    }

    public void setSphone(Integer sphone) {
        this.sphone = sphone;
    }

    public Date getSStartDate() {
        return SStartDate;
    }

    public void setSStartDate(Date SStartDate) {
        this.SStartDate = SStartDate;
    }

    public Date getSendDate() {
        return SendDate;
    }

    public void setSendDate(Date sendDate) {
        SendDate = sendDate;
    }

    public Date getFStartDate() {
        return FStartDate;
    }

    public void setFStartDate(Date FStartDate) {
        this.FStartDate = FStartDate;
    }

    public Date getFendDate() {
        return FendDate;
    }

    public void setFendDate(Date fendDate) {
        FendDate = fendDate;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
