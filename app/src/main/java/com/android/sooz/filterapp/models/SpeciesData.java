package com.android.sooz.filterapp.models;

import java.util.ArrayList;
import java.util.List;

public class SpeciesData {
    private static SpeciesData mSingleton;
    private List<StarWarsSpecies> species;


    //private default constructor so no one else can add data
    private SpeciesData(){
        species = new ArrayList<>();
        species.add(new StarWarsSpecies("Hutt", "gastropod", "Huttese", "https://swapi.co/api/planets/24/"));
        species.add(new StarWarsSpecies("Yoda's species", "mammal", "Galactic basic", "https://swapi.co/api/planets/28/"));
        species.add(new StarWarsSpecies("Trandoshan", "reptile", "Dosh", "https://swapi.co/api/planets/29/"));
        species.add(new StarWarsSpecies("Mon Calamari", "amphibian", "Mon Calamarian", "https://swapi.co/api/planets/31/"));
        species.add(new StarWarsSpecies("Ewok", "mammal", "Ewokese", "https://swapi.co/api/planets/7/"));
        species.add(new StarWarsSpecies("Sullustan", "mammal", "Sullutese", "https://swapi.co/api/planets/31/"));
        species.add(new StarWarsSpecies("Neimodian", "unknown", "Neimoidia", "https://swapi.co/api/planets/18/"));
        
    {
        "name": "Gungan",
            "classification": "amphibian",
            "designation": "sentient",
            "average_height": "190",
            "skin_colors": "brown, green",
            "hair_colors": "none",
            "eye_colors": "orange",
            "average_lifespan": "unknown",
            "homeworld": "https://swapi.co/api/planets/8/",
            "language": "Gungan basic",
            "people": [
        "https://swapi.co/api/people/36/",
                "https://swapi.co/api/people/37/",
                "https://swapi.co/api/people/38/"
			],
        "films": [
        "https://swapi.co/api/films/5/",
                "https://swapi.co/api/films/4/"
			],
        "created": "2014-12-19T17:30:37.341000Z",
            "edited": "2014-12-20T21:36:42.163000Z",
            "url": "https://swapi.co/api/species/12/"
    },
    {
        "name": "Toydarian",
            "classification": "mammal",
            "designation": "sentient",
            "average_height": "120",
            "skin_colors": "blue, green, grey",
            "hair_colors": "none",
            "eye_colors": "yellow",
            "average_lifespan": "91",
            "homeworld": "https://swapi.co/api/planets/34/",
            "language": "Toydarian",
            "people": [
        "https://swapi.co/api/people/40/"
			],
        "films": [
        "https://swapi.co/api/films/5/",
                "https://swapi.co/api/films/4/"
			],
        "created": "2014-12-19T17:48:56.893000Z",
            "edited": "2014-12-20T21:36:42.165000Z",
            "url": "https://swapi.co/api/species/13/"
    },
    {
        "name": "Dug",
            "classification": "mammal",
            "designation": "sentient",
            "average_height": "100",
            "skin_colors": "brown, purple, grey, red",
            "hair_colors": "none",
            "eye_colors": "yellow, blue",
            "average_lifespan": "unknown",
            "homeworld": "https://swapi.co/api/planets/35/",
            "language": "Dugese",
            "people": [
        "https://swapi.co/api/people/41/"
			],
        "films": [
        "https://swapi.co/api/films/4/"
			],
        "created": "2014-12-19T17:53:11.214000Z",
            "edited": "2014-12-20T21:36:42.167000Z",
            "url": "https://swapi.co/api/species/14/"
    }
	]
}

}
