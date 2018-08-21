package com.example.filterable_lists;

class userdb {
    private static final userdb ourInstance = new userdb();

    static userdb getInstance() {
        return ourInstance;
    }

    private userdb() {

    }
}
