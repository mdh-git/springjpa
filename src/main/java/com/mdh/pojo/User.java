package com.mdh.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by mdh on 2018/7/11.
 * @Entity标注这个类为JPA的一个实体
 * @Table来指定在数据库中的表名
 * @Id
 * @GeneratedValue(strategy = GenerationType.AUTO)
 标注主键id自增
 */

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // The t_user user_name
    @NotNull
    private String userName;

    // The t_user password
    @NotNull
    private String password;

    // The t_user phone
    @NotNull
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
