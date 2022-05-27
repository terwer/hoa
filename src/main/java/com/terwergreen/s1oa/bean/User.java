package com.terwergreen.s1oa.bean;

/**
 * 用户模型
 *
 * @name: User
 * @author: terwer
 * @date: 2022-05-06 20:54
 **/
public class User {
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
