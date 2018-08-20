package com.example.filterablelist.models;

import java.util.ArrayList;
import java.util.List;

public class FriendsData {
    private static FriendsData mSingleton;
    private List<Friend> friends;

    // Make the default constructor private so no one else can make one
    private FriendsData() {
        friends = new ArrayList<>();
        friends.add(new Friend("Tyler", "26", "I'm a home schooled vapey boi who loves long walks on Skellige Isle with Geralt of Rivia. 32 Vape Lyfe."));
        friends.add(new Friend("Paul", "26", "My hobbies include vaping, eating the food of my people, and stealing handles of other peoples liquor."));
        friends.add(new Friend("Luther", "22","My hobbies include the Python Lyfe, and making these guns look amazing. You see this hair? Stylin' and profilin'!"));
        friends.add(new Friend("Brandiboi", "25","I like swiping right and climbing mountains with the bois. Ramen is life, and you can't keep a good corn dog down. #EverestOneDay"));
        friends.add(new Friend("Tara", "150", "I'm a skilled programmer with a lot of self confidence issues who doesn't believe what the bois say when they tell me I am the best programmer."));
    }

    public static FriendsData get() {
        if (mSingleton == null) {
            mSingleton = new FriendsData();
        }
        return mSingleton;
    }

    public List<Friend> friends() {
        return friends;
    }

    public static List<Friend> search(String filter) {
        List<Friend> results = new ArrayList<>();

        for (Friend friend : get().friends()) {
            if (friend.name.toLowerCase().contains(filter)) {
                results.add(friend);
            } else if (friend.age.toLowerCase().contains(filter)) {
                results.add(friend);
            }
        }
        return results;
    }
}
