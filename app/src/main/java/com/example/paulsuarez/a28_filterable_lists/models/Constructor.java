package com.example.paulsuarez.a28_filterable_lists.models;

import android.content.Intent;

public class Constructor {
    public String name;
    public String rank;
    public String bio;

    public Constructor(String name, String rank, String bio) {
        this.name = name;
        this.rank = rank;
        this.bio = bio;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("rank", this.rank);
        intent.putExtra("bio", this.bio);
    }

    public static Constructor fromIntent(Intent data) {
        return new Constructor(
                data.getStringExtra("name"),
                data.getStringExtra("rank"),
                data.getStringExtra("bio")
        );
    }
}
