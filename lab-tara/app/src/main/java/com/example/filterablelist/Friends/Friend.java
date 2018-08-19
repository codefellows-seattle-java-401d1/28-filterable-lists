package com.example.filterablelist.Friends;

import android.content.Intent;

public class Friend {
    public String name;
    public String handle;
    public String bio;

    public Friend(String name, String handle, String bio) {
        this.name = name;
        this.handle = handle;
        this.bio = bio;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("handle", this.handle);
        intent.putExtra("bio", this.bio);
    }

    public static Friend fromIntent(Intent data) {
        return new Friend(
          data.getStringExtra("name"),
          data.getStringExtra("handle"),
          data.getStringExtra("bio")
        );
    }
}
