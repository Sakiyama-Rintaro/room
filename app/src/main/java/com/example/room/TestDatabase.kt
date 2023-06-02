package com.example.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TestDBEntity::class], version = 1)
abstract class TestDB : RoomDatabase() {
    abstract fun testDao(): TestDBDao
}