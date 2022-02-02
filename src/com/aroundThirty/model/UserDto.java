package com.aroundThirty.model;

public class UserDto {
    // User_Info
    private String user_ID = null; // 계정 정보
    private String user_PW = null; // 계정 정보
    private String user_Name = null; // 이름
    private String user_Gender = null; // 성별
    private String user_Num = null; // 성별
    private String user_Email = null; // 이메일
    private String user_Athority = null; // 권한
    private int no = 0; // Primary Key

    public UserDto(String user_ID, String user_PW) {
        this.user_ID = user_ID;
        this.user_PW = user_PW;
    }

    // Insert
    public UserDto(String user_ID, String user_PW, String user_Name, String user_Gender, String user_Num, String user_Email, String user_Athority) {
        this.user_ID = user_ID;
        this.user_PW = user_PW;
        this.user_Name = user_Name;
        this.user_Gender = user_Gender;
        this.user_Num = user_Num;
        this.user_Email = user_Email;
        this.user_Athority = user_Athority;
    }

    // Modify
    public UserDto(String user_PW, String user_Name, String user_Gender, String user_Num, String user_Email) {
        this.user_PW = user_PW;
        this.user_Name = user_Name;
        this.user_Gender = user_Gender;
        this.user_Num = user_Num;
        this.user_Email = user_Email;
    }

    // Delete
    public UserDto(int no) {
        this.no = no;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUser_PW() {
        return user_PW;
    }

    public void setUser_PW(String user_PW) {
        this.user_PW = user_PW;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Gender() {
        return user_Gender;
    }

    public void setUser_Gender(String user_Gender) {
        this.user_Gender = user_Gender;
    }

    public String getUser_Num() {
        return user_Num;
    }

    public void setUser_Num(String user_Num) {
        this.user_Num = user_Num;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Athority() {
        return user_Athority;
    }

    public void setUser_Athority(String user_Athority) {
        this.user_Athority = user_Athority;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return user_ID + " " + user_PW + " " + user_Name + " " + user_Gender + " " + user_Num + " " + user_Email + " " + user_Athority + " " + no;
    }
}
