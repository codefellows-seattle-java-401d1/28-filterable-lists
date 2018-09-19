package com.example.panos.myapplication.Classes;

import android.content.Intent;

public class Event {
    public String date;
    public String name;
    public String description;
    public Event(String s1, String s2, String s3){
        date = s1;
        name = s2;
        description = s3;
    }
    public void fillIntent(Intent intent){
        intent.putExtra("name",this.name);
        intent.putExtra("date",this.date);
        intent.putExtra("description",this.description);
    }
    public static Event fromIntent(Intent data){
        return new Event(
                data.getStringExtra("date"),
                data.getStringExtra("name"),
                data.getStringExtra("description")
        );
    }
}
