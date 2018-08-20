package com.example.filterablelist.models;

import android.content.Intent;

public class Friend {
    public String name;
    public String age;
    public String bio;

    public Friend(String name, String age, String bio) {
        this.name = name;
        this.age = age;
        this.bio = bio;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("handle", this.age);
        intent.putExtra("bio", this.bio);
    }

    public static Friend fromIntent(Intent data) {
        return new Friend(
                data.getStringExtra("name"),
                data.getStringExtra("age"),
                data.getStringExtra("bio")
        );
    }
}