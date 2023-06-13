package com.example.wirerope.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ReelEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="barrel diameter")
    public String barrelDiameter;

    @ColumnInfo(name="flange diameter")
    public String flangeDiameter;

    @ColumnInfo(name="traverse distance")
    public String traverseDistance;

    @ColumnInfo(name="spool name")
    public String spoolName;

    @ColumnInfo(name="note")
    public String note;

    public ReelEntity(String barrelDiameter, String flangeDiameter, String traverseDistance, String spoolName, String note) {
        this.barrelDiameter = barrelDiameter;
        this.flangeDiameter = flangeDiameter;
        this.traverseDistance = traverseDistance;
        this.spoolName = spoolName;
        this.note = note;
    }
}
