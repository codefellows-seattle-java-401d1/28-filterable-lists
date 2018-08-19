package com.example.a28_filterable_lists.starfleet;

import java.util.ArrayList;
import java.util.List;

public class FabricData {
    private static FabricData mSingleton;
    private List<Fabrics> fabrics;

    // make the default constructor private so no one else can make one
    private FabricData() {
        fabrics = new ArrayList<>();
        fabrics.add(new Fabrics("Cait", "knit", "DBP",
                "\"Double\" - means the fabric is brushed on both sides\n" +
                        "\"Single\" - means fabric is brushed on one side, smooth on the other. \n" +
                        "96% POLYESTER / 4% SPANDEX\n" +
                        "58\"/60\"\" wide \n" +
                        "Medium weight\n" +
                        "4 - WAY stretch\n" +
                        "Works very well for dresses, leggings, tops, etc.\n" +
                        "CARE: Wash on cold, tumble dry"));
        fabrics.add(new Fabrics("Devon", "knit", "hacci sweater",
                "POLY/SPANDEX\n" +
                        "If listing says “Brushed” means is has a brushed “fuzzy” texture to it\n" +
                        "4-way stretch\n" +
                        "Medium weight\n" +
                        "58\" Wide\n" +
                        "This fabric is very soft and cozy. Perfect for sweaters, tops and dresses. \n" +
                        "CARE: wash cold, tumble dry or lay flat to dry"));
        fabrics.add(new Fabrics("Jamie", "knit", "DBP",
                "\"Double\" - means the fabric is brushed on both sides\n" +
                        "\"Single\" - means fabric is brushed on one side, smooth on the other. \n" +
                        "96% POLYESTER / 4% SPANDEX\n" +
                        "58\"/60\"\" wide \n" +
                        "Medium weight\n" +
                        "4 - WAY stretch\n" +
                        "Works very well for dresses, leggings, tops, etc.\n" +
                        "CARE: Wash on cold, tumble dry"));
        fabrics.add(new Fabrics("Maize", "knit", "DBP",
                "\"Double\" - means the fabric is brushed on both sides\n" +
                        "\"Single\" - means fabric is brushed on one side, smooth on the other. \n" +
                        "96% POLYESTER / 4% SPANDEX\n" +
                        "58\"/60\"\" wide \n" +
                        "Medium weight\n" +
                        "4 - WAY stretch\n" +
                        "Works very well for dresses, leggings, tops, etc.\n" +
                        "CARE: Wash on cold, tumble dry"));
        fabrics.add(new Fabrics("Serenity", "knit", "Viscose",
                "4-way stretch\n" +
                        "96% Viscose from Bamboo/4% spandex\n" +
                        "58\"-60\" WIDE Very soft with a nice drape. This fabric works really well for tops, dresses, skirts, etc.\n" +
                        "CARE: wash cold, tumble dry"));
    }


    public static FabricData get() {
        if (mSingleton == null) {
            mSingleton = new FabricData();
        }
        return mSingleton;
    }

    // create a getter to prevent others from reassigning the list to null or another list.
    public List<Fabrics> fabrics() {
        return fabrics;
    }

    public static List<Fabrics> search(String filter) {
        List<Fabrics> results = new ArrayList<>();

        for (Fabrics fabric : get().fabrics()) {
            if (fabric.name.toLowerCase().contains(filter)) {
                results.add(fabric);
            } else if (fabric.category.toLowerCase().contains(filter)) {
                results.add(fabric);
            } else if (fabric.type.toLowerCase().contains(filter)) {
                results.add(fabric);
            }
        }

        return results;
    }
}
