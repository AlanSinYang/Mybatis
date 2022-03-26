package com.kuang.pojo;
//实体类
public class User {
    private int uid;
    private String uname;
    private String uage;


    public User() {
    }

    public User(int uid, String uname, String uage) {
            this.uid = uid;
            this.uname = uname;
            this.uage = uage;
        }
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage='" + uage + '\'' +
                '}';
    }
}
