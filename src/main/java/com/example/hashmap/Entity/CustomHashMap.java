package com.example.hashmap.Entity;

public class CustomHashMap {
    private Entry[] table;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;

    public CustomHashMap(){
        this.table = new Entry[DEFAULT_INITIAL_CAPACITY];
        this.size = DEFAULT_INITIAL_CAPACITY;
    }


}
