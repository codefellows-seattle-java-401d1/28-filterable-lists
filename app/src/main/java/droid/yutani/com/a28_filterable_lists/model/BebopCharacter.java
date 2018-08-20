package droid.yutani.com.a28_filterable_lists.model;

import android.content.Intent;

public class BebopCharacter {
    public String name;
    public String job;
    public String desc;

    public BebopCharacter (String name, String job, String desc) {
        this.name = name;
        this.job = job;
        this.desc = desc;
    }

    public void fillIntent(Intent intent) {
        intent.putExtra("name", this.name);
        intent.putExtra("job", this.job);
        intent.putExtra("desc", this.desc);
    }

    public static BebopCharacter fromIntent(Intent data) {
        return new BebopCharacter(
                data.getStringExtra("name"),
                data.getStringExtra("job"),
                data.getStringExtra("desc")
        );
    }
}
