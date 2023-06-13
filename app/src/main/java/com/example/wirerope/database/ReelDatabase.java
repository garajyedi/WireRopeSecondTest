package com.example.wirerope.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {ReelEntity.class},version = 1)
public abstract class ReelDatabase extends RoomDatabase {
    public abstract ReelDao reelDao();
}
