package com.example.wirerope.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface ReelDao {
    @Query("SELECT * FROM reelentity")
    Flowable<List<ReelEntity>> getAll();

    @Insert
    Completable insert(ReelEntity reelEntity);

    @Delete
    Completable delete(ReelEntity reelEntity);
}
