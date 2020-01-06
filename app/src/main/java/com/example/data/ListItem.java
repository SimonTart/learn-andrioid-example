package com.example.data;

public class ListItem {
    private String time;
    private String text;

    public  ListItem(String time, String text) {
        this.time = time;
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
