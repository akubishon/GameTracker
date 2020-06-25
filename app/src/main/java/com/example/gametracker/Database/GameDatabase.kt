package com.example.gametracker.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.gametracker.Converters.Converters
import com.example.gametracker.Models.Game

@Database(entities = [Game::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)

abstract class GameDatabase : RoomDatabase() {

    abstract fun GameDao(): GameDao

companion object {
    val DATABASE_NAME = "GAME_DATABASE"

    @Volatile
    var gameDatabaseInstance: GameDatabase? = null

    fun getDatabase(context: Context): GameDatabase? {
        if (gameDatabaseInstance == null) {
            synchronized(GameDatabase::class.java) {
                if (gameDatabaseInstance == null) {
                    gameDatabaseInstance = Room.databaseBuilder(
                        context.applicationContext,
                        GameDatabase::class.java, DATABASE_NAME
                    ).build()

                }
            }


        }
        return gameDatabaseInstance
    }
}
}

