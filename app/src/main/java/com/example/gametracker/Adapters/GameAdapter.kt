package com.example.gametracker.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gametracker.Models.Game
import com.example.gametracker.R
import kotlinx.android.synthetic.main.fragment_add_game.view.etTitle
import kotlinx.android.synthetic.main.item_game.view.*

class GameAdapter(val games: List<Game>) :
        RecyclerView.Adapter<GameAdapter.ViewHolder>(){

lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_game, parent, false)

        )
    }

    override fun getItemCount(): Int {
        return games.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.assign(games[position])
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun assign(game: Game) {
            itemView.tvTitle.text = game.title
            itemView.tvPlatform.text = game.platform
            itemView.tvDay.text = game.day.toString()
            itemView.tvMonth.text = game.month.toString()
            itemView.tvYear.text = game.year.toString()








        }
    }


}