package com.example.tokyoolympicsgames2021.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tokyoolympicsgames2021.DataManger
import com.example.tokyoolympicsgames2021.adapter.GameAdapter
import com.example.tokyoolympicsgames2021.databinding.ActivityMainBinding
import com.example.tokyoolympicsgames2021.utails.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFile()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val adapter = GameAdapter(DataManger.getOlympicsGame())
        binding.recyclerViewGames.adapter = adapter
    }

    private fun openFile() {
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            val currentGameData = CsvParser().parserData(it)
            Log.d("a", currentGameData.toString())
            DataManger.addOlympicsGame(currentGameData)
        }
    }
}