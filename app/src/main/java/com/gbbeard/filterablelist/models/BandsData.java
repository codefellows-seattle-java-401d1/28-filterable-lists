package com.gbbeard.filterablelist.models;

import java.util.ArrayList;
import java.util.List;

public class BandsData {
    private static BandsData mSingleton;
    private List<Bands> bandsList;

    private BandsData() {
        bandsList = new ArrayList<>();
        bandsList.add(new Bands("Animal Collect", "Avey Tare, Panda Bear, Deakin, Geologist", "neo-psychedelia"));
        bandsList.add(new Bands("Avey Tare", "Avey Tare", "Acoustic-Electric"));
        bandsList.add(new Bands("Panda Bear", "Panda Bear", "Neo-Pschedelia"));
        bandsList.add(new Bands("Black Dice", "Eric Copeland, Aaron Warren, Bjorn Copeland", "Experimental rock"));
        bandsList.add(new Bands("Eric Copeland", "Eric Copeland", "Avant Pop"));
        bandsList.add(new Bands("Deerhunter", "Bradford Cox, Lockett Pundt, Moses Archuleta, Josh McKay", "Psychedelic Pop"));
        bandsList.add(new Bands("The Flaming Lips", "Wayne Coyne, Michael Ivins, Steven Drozd", "Psychedelic rock"));
        bandsList.add(new Bands("Modest Mouse", "Isaac Brock, Jeremiah Green, Tom Peloso, Jim Fairchild", "Indie Rock"));

    }
    public static BandsData get() {
        if (mSingleton == null) {
            mSingleton = new BandsData();

        }
        return mSingleton;
    }

    public List<Bands> bandsList() {
        return bandsList;
    }

    public static List<Bands> search(String filter) {
        List<Bands> results = new ArrayList<>();

        for (Bands band : get().bandsList()) {
            if (band.name.toLowerCase().contains(filter)) {
                results.add(band);
            } else if (band.members.toLowerCase().contains(filter)) {
                results.add(band);
            }
        }

        return results;
    }
}
