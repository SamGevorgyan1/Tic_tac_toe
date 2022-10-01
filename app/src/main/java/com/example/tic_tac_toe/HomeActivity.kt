package com.example.tic_tac_toe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.widget.AppCompatButton

class HomeActivity : AppCompatActivity() {

    private lateinit var button_play: AppCompatButton
    private lateinit var button_quit: AppCompatButton
private lateinit var button_help:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        button_quit = findViewById(R.id.button_quit)
        button_play = findViewById(R.id.button_play)
        button_help=findViewById(R.id.button_help)
        button_help.setOnClickListener{
            Toast.makeText(this, "not working", Toast.LENGTH_SHORT).show()
        }
        button_play.setOnClickListener {
            val intent = Intent(this, StartGameActivity::class.java)
            startActivity(intent)
            button_quit.setOnClickListener{
                System.out
            }
        }

    }
}