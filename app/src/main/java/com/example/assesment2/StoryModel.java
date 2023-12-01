package com.example.assesment2;

public class StoryModel {
    String vid, sid, name;
    int image, type;

    public StoryModel(int type, String vid, String sid, String name, int image){
        this.type = type;
        this.vid = vid;
        this.sid = sid;
        this.name = name;
        this.image = image;

    }

    public StoryModel(int type, String vid, int image){
        this.vid = vid;
        this.image = image;
        this.type = type;
    }

//    public StoryModel(String vid) {
//        this.vid = vid;
//    }
//
//    public StoryModel(int image) {
//        this.image = image;
//    }


    public String getVid() {
        return vid;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }
}
