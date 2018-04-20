package com.hr.entity;

import java.sql.Date;

public class Student {
    private Integer sid;

    private String sname;

    private Integer sage;

    private Date sbirth;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Date getSbirth() {
        return sbirth;
    }

    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }
}