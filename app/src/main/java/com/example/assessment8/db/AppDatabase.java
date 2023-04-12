package com.example.assessment8.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Drink.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract DrinkDAO drinkDAO();
}

