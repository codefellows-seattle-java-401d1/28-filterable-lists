package com.android.sooz.filterapp.models;

import java.util.ArrayList;
import java.util.List;

public class SpeciesData {
    private static SpeciesData mSingleton;
    private List<StarWarsSpecies> species;


    //private default constructor so no one else can add data
    private SpeciesData() {
        species = new ArrayList<>();
        species.add(new StarWarsSpecies("Hutt", "gastropod", "Huttese", "https://swapi.co/api/planets/24/"));
        species.add(new StarWarsSpecies("Yoda's species", "mammal", "Galactic basic", "https://swapi.co/api/planets/28/"));
        species.add(new StarWarsSpecies("Trandoshan", "reptile", "Dosh", "https://swapi.co/api/planets/29/"));
        species.add(new StarWarsSpecies("Mon Calamari", "amphibian", "Mon Calamarian", "https://swapi.co/api/planets/31/"));
        species.add(new StarWarsSpecies("Ewok", "mammal", "Ewokese", "https://swapi.co/api/planets/7/"));
        species.add(new StarWarsSpecies("Sullustan", "mammal", "Sullutese", "https://swapi.co/api/planets/31/"));
        species.add(new StarWarsSpecies("Neimodian", "unknown", "Neimoidia", "https://swapi.co/api/planets/18/"));
        species.add(new StarWarsSpecies("Gungan", "amphibian", "Gungan basic", "https://swapi.co/api/planets/8/"));
        species.add(new StarWarsSpecies("Tovdarian", "mammal", "Toydarian", "https://swapi.co/api/planets/34/"));
        species.add(new StarWarsSpecies("Dug", "mammal", "Dugese", "https://swapi.co/api/planets/35/"));
    }

    //not sure, but I think this helps handle search filter
    public static SpeciesData get(){
        if(mSingleton == null) {
            mSingleton = new SpeciesData();
        }
        return mSingleton;
    }

    //create a getter method to prevent the list from
    // being set to null or another list
    public List<StarWarsSpecies> species(){
        return species;
    }

    //search method for the list to make it filterable
    //eventually would like to pull in planet data as string and make searchable by planet too
    //makes list searchable by species name and classification (mammal, reptile, etc.)
    public static List<StarWarsSpecies> search(String filter){
        List<StarWarsSpecies> results = new ArrayList<>();

        for (StarWarsSpecies alien : get().species()) {
            if (alien.name.toLowerCase().contains(filter)) {
                results.add(alien);
            } else if (alien.classification.toLowerCase().contains(filter)) {
                results.add(alien);
            }
        }

        return results;
    }
}


