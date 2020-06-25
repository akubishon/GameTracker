package com.example.gametracker.Database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.gametracker.Models.Game

interface GameDao {

    @Query("SELECT * FROM gameTable ORDER BY year, month, day")
    fun listAllGames(): LiveData<List<Game>>

    @Insert
    fun insertGame(game: Game)

    @Delete
    fun deleteGame (game: Game)





}