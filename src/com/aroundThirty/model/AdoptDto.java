package com.aroundThirty.model;

public class AdoptDto {
    public int no = 0; // Primary Key
    public String user_ID = null; // 계정 정보
    public String adopt_Place = null; // 분양소
    public String kind_Adopt = null; // 품종
    public String phone_Num = null; // 전화 번호
    public String detail = null; // 게시글 본문
    public String post_Create_Datetime = null; // 게시글 작성 날짜 및 시간
    public String post_Modify_Datetime = null; // 게시글 수정 날짜 및 시간
    public String thumbnail_Img = null; // 동물 사진

    // show
    public AdoptDto(int no,String user_ID, String adopt_Place, String kind_Adopt, String phone_Num, String detail, String post_Create_Datetime, String post_Modify_Datetime) {
        this.no = no;
        this.user_ID = user_ID;
        this.adopt_Place = adopt_Place;
        this.kind_Adopt = kind_Adopt;
        this.phone_Num = phone_Num;
        this.detail = detail;
        this.post_Create_Datetime = post_Create_Datetime;
        this.post_Modify_Datetime = post_Modify_Datetime;
        // this.thumbnail_Img = thumbnail_Img;
    }

    public AdoptDto(int no, String user_ID) {
        this.no = no;
        this.user_ID = user_ID;
    }


    public String getThumbnail_Img() {
        return thumbnail_Img;
    }

    public void setThumbnail_Img(String thumbnail_Img) {
        this.thumbnail_Img = thumbnail_Img;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        user_ID = user_ID;
    }

    public String getAdopt_Place() {
        return adopt_Place;
    }

    public void setAdopt_Place(String adopt_Place) {
        this.adopt_Place = adopt_Place;
    }

    public String getKind_Adopt() {
        return kind_Adopt;
    }

    public void setKind_Adopt(String kind_Adopt) {
        this.kind_Adopt = kind_Adopt;
    }

    public String getPhone_Num() {
        return phone_Num;
    }

    public void setPhone_Num(String phone_Num) {
        this.phone_Num = phone_Num;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPost_Create_Datetime() {
        return post_Create_Datetime;
    }

    public void setPost_Create_Datetime(String post_Create_Datetime) {
        this.post_Create_Datetime = post_Create_Datetime;
    }

    public String getPost_Modify_Datetime() {
        return post_Modify_Datetime;
    }

    public void setPost_Modify_Datetime(String post_Modify_Datetime) {
        this.post_Modify_Datetime = post_Modify_Datetime;
    }

    @Override
    public String toString() {
        return no + " " + user_ID + " " + adopt_Place + " " + kind_Adopt + " "  + phone_Num + " " + detail + " " + post_Create_Datetime + " " + post_Modify_Datetime;
    }
}