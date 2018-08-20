package com.example.filterablelist.Friends;

import java.util.ArrayList;
import java.util.List;

public class FriendsData {
    private static FriendsData mSingleton;
    private List<Friend> friends;

    // Make the default constructor private so no one else can make one
    private FriendsData() {
        friends = new ArrayList<>();
        friends.add(new Friend("Katy Perry", "@katyperry", "Love. Light."));
        friends.add(new Friend("Justin Bieber", "@justinbieber", "Let\\'s make the world better. Join me on @bkstg at \\'justinbieber\\'. PURPOSE OUT NOW"));
        friends.add(new Friend("Barack Obama", "@BarackObama","Dad, husband, President, citizen."));
        friends.add(new Friend("Rihanna", "@rihanna","ProFilter Foundation back in stock @fentybeauty at https://t.co/6HarIz1NrP !!"));
        friends.add(new Friend("Taylor Swift", "@taylorswift13", "The old Taylor can\\'t come to the phone right now."));
    }

    public static FriendsData get() {
        if (mSingleton == null) {
            mSingleton = new FriendsData();
        }
        return mSingleton;
    }
.
    public List<Friend> friends() {
        return friends;
    }

    public static List<Friend> search(String filter) {
        List<Friend> results = new ArrayList<>();

        for (Friend friend : get().friends()) {
            if (friend.name.toLowerCase().contains(filter)) {
                results.add(friend);
            } else if (friend.handle.toLowerCase().contains(filter)) {
                results.add(friend);
            }
        }
        return results;
    }
}
