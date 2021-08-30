package com.example.tokyoolympicsgames2021

import com.example.tokyoolympicsgames2021.model.OlympicsGame

object DataManger {
    private val olympicsGameList = mutableListOf<OlympicsGame>()

    fun addOlympicsGame(olympicsGame: OlympicsGame) = olympicsGameList.add(olympicsGame)

    fun getOlympicsGame() = olympicsGameList


}