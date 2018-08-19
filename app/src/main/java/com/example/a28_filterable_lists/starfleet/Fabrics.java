package com.example.a28_filterable_lists.starfleet;

import android.content.Intent;

public class Fabrics {
    public String name;
    public String category;
    public String type;
    public String description;

    public Fabrics(String name, String category, String type, String description) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.description = description;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("category", this.category);
        intent.putExtra("type", this.type);
        intent.putExtra("description", this.description);
    }

    public static Fabrics fromIntent(Intent data) {
        return new Fabrics(
                data.getStringExtra("name"),
                data.getStringExtra("category"),
                data.getStringExtra("type"),
                data.getStringExtra("description")
        );
    }
}
