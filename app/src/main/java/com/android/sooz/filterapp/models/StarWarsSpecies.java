package com.android.sooz.filterapp.models;

import android.content.Intent;

//class that models the species data for use in the list
public class StarWarsSpecies {
    public String name;
    public String classification;
    public String language;
    public String homeworld;

    //creates property values for construction a species in the application
    public StarWarsSpecies(String name, String classification, String language, String homeworld){
        this.name = name;
        this.classification = classification;
        this.language = language;
        this.homeworld = homeworld;
    }

    //allows desired species data object to be passed from to an activity/view
    public void fillIntent(Intent intent){
        intent.putExtra("name", this.name);
        intent.putExtra("classification", this.classification);
        intent.putExtra("language", this.language);
        intent.putExtra("homeworld", this.homeworld);
    }

    //helps create new species
    public static StarWarsSpecies fromIntent(Intent data){
       return new StarWarsSpecies(
               data.getStringExtra("name"),
               data.getStringExtra("bio"),
               data.getStringExtra("classification"),
               data.getStringExtra("homeworld")
       );
    }

}
