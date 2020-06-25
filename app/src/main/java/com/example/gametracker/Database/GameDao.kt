package com.example.gametracker.Database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.gametracker.Models.Game

interface GameDao {

    @Query("SELECT * FROM gameTable ORDER BY year ASC, month ASC, day ASC")
    fun listAllGames(): LiveData<List<Game>>

    @Insert
    suspend fun insertGame(game: Game)

    @Delete
    suspend fun deleteGame (game: Game)





}