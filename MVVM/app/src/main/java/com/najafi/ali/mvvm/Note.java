package com.najafi.ali.mvvm;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String descripiton;
    private int priority;


    public Note(String title, String descripiton, int priority) {
        this.title = title;
        this.descripiton = descripiton;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public int getPriority() {
        return priority;
    }

}
