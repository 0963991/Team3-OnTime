package com.example.ontimeapp;

public class AddMemberAdapter {

    private String name;
    private String deviceToken;

    public AddMemberAdapter(){
    }

    public AddMemberAdapter(String name, String deviceToken){
        this.name = name;
        this.deviceToken = deviceToken;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceToken(){
        return deviceToken;
    }

}
