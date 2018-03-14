package com.demo.w.reflect;

public class User {

    public String userName;
    public String pwd;

    public User(){

    }

    public User(String userName,float f,Employee e){

    }
    public User(int u1,int u2,int userName){

    }
    public User(float userName,int uu){

    }
    private User(double u){

    }
    private User(String userName,String pwd){
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void getMethod(){

    }
}
