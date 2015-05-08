package com.ceit.bh.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 刘台振 on 15-5-7.
 */
@Entity
@Table(name="tb_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private  String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
