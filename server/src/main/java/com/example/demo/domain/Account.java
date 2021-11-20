package com.example.demo.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;

    @Column(name = "user_name_sei")
    private String user_name_sei;

    @Column(name = "user_name_mei")
    private String user_name_mei;

    @Column(name = "create_date")
    private Date create_date;

    @Column(name = "create_user")
    private String create_user;

    @Column(name = "password")
    private String password;

    @Column(name = "is_deleated")
    private boolean is_deleated;

    @Column(name = "update_time")
    private Date update_time;

    @Column(name = "update_user")
    private String update_user;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name_sei() {
        return user_name_sei;
    }

    public void setUser_name_sei(String user_name_sei) {
        this.user_name_sei = user_name_sei;
    }

    public String getUser_name_mei() {
        return user_name_mei;
    }

    public void setUser_name_mei(String user_name_mei) {
        this.user_name_mei = user_name_mei;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_deleated() {
        return is_deleated;
    }

    public void setIs_deleated(boolean is_deleated) {
        this.is_deleated = is_deleated;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }
}