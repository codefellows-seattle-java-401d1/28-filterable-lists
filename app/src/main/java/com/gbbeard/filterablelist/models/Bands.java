package com.gbbeard.filterablelist.models;


import android.content.Intent;

public class Bands {
    public String name;
    public String members;
    public String genre;

    public Bands(String name, String members, String genre) {
        this.name = name;
        this.members = members;
        this.genre = genre;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("members", this.members);
        intent.putExtra("genre", this.genre);

    }

    public static Bands fromIntent(Intent data) {
        return new Bands(data.getStringExtra("name"),
                data.getStringExtra("members"), data.getStringExtra("genre")
        );
    }
}
