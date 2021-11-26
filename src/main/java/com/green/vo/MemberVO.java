package com.green.vo;

import java.util.Date;

public class MemberVO {
    private int id;
    private String member_id;
    private String member_password;
    private String member_name;
    private String member_address;
    private String member_phonenumber;
    private String member_gender;
    private Date member_date;

    public int getId() {
        return id;
    }

    public String getMember_id() {
        return member_id;
    }

    public String getMember_password() {
        return member_password;
    }

    public String getMember_name() {
        return member_name;
    }

    public String getMember_address() {
        return member_address;
    }

    public String getMember_phonenumber() {
        return member_phonenumber;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public Date getMember_date() {
        return member_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }

    public void setMember_phonenumber(String member_phonenumber) {
        this.member_phonenumber = member_phonenumber;
    }

    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }

    public void setMember_date(Date member_date) {
        this.member_date = member_date;
    }
}
