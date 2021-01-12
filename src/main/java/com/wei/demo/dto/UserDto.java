package com.wei.demo.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Title UserDto
 * @Author wei
 * @Date 2020/12/17 14:37
 * @Description
 */
@Entity
@Data
@Table(name = "w_user")
public class UserDto implements Serializable {
    private static final long serialVersionUID = 4038201589426562709L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;

    /**
     * 用户名
     */
    @Column(name = "user")
    private String user;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 年龄
     */
    @Column(name = "age")
    private int  age;

    /**
     * 身高
     */
    @Column(name = "height")
    private double height;

    /**
     * 体重
     */
    @Column(name = "weight")
    private double weight;
}
