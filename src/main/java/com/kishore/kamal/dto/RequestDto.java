package com.kishore.kamal.dto;

public class RequestDto {

    String yourName;
    String crushName;

    public RequestDto() {
        this.yourName="yourName";
        this.crushName="crushName";
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }
}
