package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private var player:ArrayList<String> = arrayListOf("player1","player2","player3","player4","player5","player6","player7","player8","player9","player10")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,player)

        listView.setOnItemClickListener{parent, view, position, id ->

            Toast.makeText(this,"You selected ${player[position]}",Toast.LENGTH_SHORT).show()
        }




    }
}