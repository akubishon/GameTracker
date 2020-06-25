package com.example.gametracker

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.gametracker.Models.Game
import kotlinx.android.synthetic.main.fragment_add_game.*

class AddGame:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_add_game)

        btn_addgame.setOnClickListener {
            onGameAddClick()
        }
        initViews()

    }

    private fun initViews() {
        supportActionBar?.title = "Add Activity"
    }

    fun onGameAddClick() {
        val game = Game(
            etTitle.toString(), etPlatform.text.toString(), etYear.text.toString().toInt(),
            etMonth.text.toString().toInt(), etDay.text.toString().toInt()
        )
        val intent = Intent()
        intent.putExtra("NEW_GAME", game)
        finish()

    }
}
