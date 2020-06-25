package com.example.gametracker.Database

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.gametracker.Models.Game

public class GameRepository(context: Context) {

    private val gameDao: GameDao

    init {
        val database = GameDatabase.getDatabase(context)
        gameDao = database!!.GameDao()
    }

    fun listAllGames(): LiveData<List<Game>> {
        return gameDao.listAllGames()
    }
    fun deleteGame(game: Game) {
        gameDao.deleteGame(game)
    }
    fun insertGame(game: Game){
        gameDao.insertGame(game)
    }

}
