package com.example.panos.myapplication.Classes;

import java.util.ArrayList;
import java.util.List;

public class EventData {
    private static EventData mSingleton;
    private List<Event> events;
    private EventData(){
        events = new ArrayList<>();
        events.add(new Event("16 December 1944","Battle of the Bulge","Last major German offensive on the Western Front during WW2"));
        events.add(new Event("12 October 1945","Formation of the United Nations","The creation of the United Nations to replace the League of Nations."));
        events.add(new Event("431 BC","Peloponnesian War","The conquering of Athens by Sparta."));
        events.add(new Event("49 BC","Crossing the Rubicon","Julius Caesar crossing the Rubicon river with his army, beginning the Roman Civil War"));
        events.add(new Event("1185 AD","Establishment of the Shogunate","Establishment of the effective military dictatorship over Japan."));
    }

    public static EventData get(){
        if(mSingleton == null){
            mSingleton = new EventData();
        }
        return mSingleton;
    }

    public List<Event> events(){
        return events;
    }

    public static List<Event> search(String filter){
        List<Event> results = new ArrayList<>();
        for(Event event : get().events()){
            if(event.name.toLowerCase().contains(filter)){
                results.add(event);
            }else if (event.description.toLowerCase().contains(filter)){
                results.add(event);
            }else if (event.date.toLowerCase().contains(filter)){
                results.add(event);
            }
        }
        return results;
    }
}
