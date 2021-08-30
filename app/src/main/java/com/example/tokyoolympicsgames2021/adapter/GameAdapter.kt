package com.example.tokyoolympicsgames2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympicsgames2021.R
import com.example.tokyoolympicsgames2021.databinding.ItemCountryGameBinding
import com.example.tokyoolympicsgames2021.model.OlympicsGame

class GameAdapter(private val listGame: MutableList<OlympicsGame>): RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country_game, parent, false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentCountry = listGame[position]
        holder.binding.apply {
            txtNOCCode.text = currentCountry.NOCCode
            txtGoldMedal.text = currentCountry.Gold_Medal.toString()
            txtSilverMedal.text = currentCountry.Gold_Medal.toString()
            txtBronzeMedal.text = currentCountry.Gold_Medal.toString()
            txtTotalRank.text = currentCountry.Rank_by_Total.toString()
        }
    }

    override fun getItemCount() = listGame.size

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemCountryGameBinding.bind(itemView)
    }
}