package com.example.assessment8.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DrinkDAO
{
    @Query("SELECT * FROM drinks")
    List<Drink> getAll();

    @Insert
    void insertAll(Drink... drinks);

    @Query("SELECT * FROM drinks WHERE id = :id")
    Drink findById(long id);

    @Delete
    void delete(Drink drink);

    @Query("DELETE FROM drinks")
    void deleteAll();

    @Update
    void update(Drink drink);
}
