package com.example.tokyoolympicsgames2021.utails

import com.example.tokyoolympicsgames2021.model.OlympicsGame

class CsvParser {
    fun parserData(line : String) : OlympicsGame {
        val token =  line.split(",")
        return OlympicsGame(
            Rank = token[Constants.ColumnOlympicsGame.RANK].toInt(),
            Team_NOC = token[Constants.ColumnOlympicsGame.TEAM_NOC],
            Gold_Medal = token[Constants.ColumnOlympicsGame.GOLD_MEDAL].toInt(),
            Silver_Medal = token[Constants.ColumnOlympicsGame.SILVER_MEDAL].toInt(),
            Bronze_Medal = token[Constants.ColumnOlympicsGame.BRONZE_MEDAL].toInt(),
            Total = token[Constants.ColumnOlympicsGame.TOTAL].toInt(),
            Rank_by_Total = token[Constants.ColumnOlympicsGame.RANK_BY_TOTAL].toInt(),
            NOCCode = token[Constants.ColumnOlympicsGame.NOCCODE],
        )
    }
}