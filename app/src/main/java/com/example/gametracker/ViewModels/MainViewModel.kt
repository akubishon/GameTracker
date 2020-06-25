package com.example.gametracker.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.gametracker.Database.GameRepository
import com.example.gametracker.Models.Game
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {



    private val mainScope = CoroutineScope(Dispatchers.Main)
    private val gameRepository = GameRepository(application.applicationContext)

    val savedGames: LiveData<List<Game>> = gameRepository.listAllGames()

    fun insertGame(game: Game){
        mainScope.launch {
            gameRepository.insertGame(game)

        }
    }
    fun deleteGame(game: Game){
        mainScope.launch {
            gameRepository.insertGame(game)
        }
    }
}