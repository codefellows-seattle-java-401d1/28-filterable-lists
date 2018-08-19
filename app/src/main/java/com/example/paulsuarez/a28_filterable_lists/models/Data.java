package com.example.paulsuarez.a28_filterable_lists.models;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data mSingleton;
    private List<Constructor> users;

    private Data() {
        users = new ArrayList<>();
        users.add(new Constructor("Golemagg", "50 mana 20 attack 20 health", "Costs (1) less for each damage your hero has taken."));
        users.add(new Constructor("C'Thun", "10 mana 6 attack 6 health", "Deal damage equal to this minion's Attack randomly split among all enemies."));
        users.add(new Constructor("Deathwing, Dragonlord", "10 mana 12 attack 12 health", "Put all Dragons from your hand into the battlefield."));
    }

    public static Data get() {
        if (mSingleton == null) {
            mSingleton = new Data();
        }
        return mSingleton;
    }

    public List<Constructor> users() {
        return users;
    }

    public static List<Constructor> search(String filter) {
        List<Constructor> results = new ArrayList<>();

        for (Constructor person : get().users()) {
            if (person.name.toLowerCase().contains(filter)) {
                results.add(person);
            } else if (person.rank.toLowerCase().contains(filter)) {
                results.add(person);
            }
        }

        return results;
    }
}
