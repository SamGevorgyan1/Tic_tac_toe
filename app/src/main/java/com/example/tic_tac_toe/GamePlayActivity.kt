package com.example.tic_tac_toe


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class GamePlayActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var buttonPlace1: AppCompatButton
    lateinit var buttonPlace2: AppCompatButton
    lateinit var buttonPlace3: AppCompatButton
    lateinit var buttonPlace4: AppCompatButton
    lateinit var buttonPlace5: AppCompatButton
    lateinit var buttonPlace6: AppCompatButton
    lateinit var buttonPlace7: AppCompatButton
    lateinit var buttonPlace8: AppCompatButton
    lateinit var buttonPlace9: AppCompatButton
    lateinit var player1name: TextView
    lateinit var player2name: TextView

    private var queue: Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val getPlayer1name: String?
        val getPlayer2name: String?

        getPlayer1name = intent.getStringExtra("player1name").toString()
        getPlayer2name = intent.getStringExtra("player2name").toString()

        setContentView(R.layout.activity_game_play)
        player1name = findViewById(R.id.player1name)
        player2name = findViewById(R.id.player2name)

        player1name.setText(getPlayer1name)
        player2name.setText(getPlayer2name)

        buttonPlace1 = findViewById(R.id.buttonPlace1)
        buttonPlace2 = findViewById(R.id.buttonPlace2)
        buttonPlace3 = findViewById(R.id.buttonPlace3)
        buttonPlace4 = findViewById(R.id.buttonPlace4)
        buttonPlace5 = findViewById(R.id.buttonPlace5)
        buttonPlace6 = findViewById(R.id.buttonPlace6)
        buttonPlace7 = findViewById(R.id.buttonPlace7)
        buttonPlace8 = findViewById(R.id.buttonPlace8)
        buttonPlace9 = findViewById(R.id.buttonPlace9)


        buttonPlace1.setOnClickListener(this)
        buttonPlace2.setOnClickListener(this)
        buttonPlace3.setOnClickListener(this)
        buttonPlace4.setOnClickListener(this)
        buttonPlace5.setOnClickListener(this)
        buttonPlace6.setOnClickListener(this)
        buttonPlace7.setOnClickListener(this)
        buttonPlace8.setOnClickListener(this)
        buttonPlace9.setOnClickListener(this)

    }

/**
    private fun win() {


        if (buttonPlace1.equals(R.drawable.ic_x) && buttonPlace2.equals(R.drawable.ic_x) && buttonPlace3.equals(
                R.drawable.ic_x
            )
        ) {
            Toast.makeText(this, "win x", Toast.LENGTH_SHORT).show()
        }
    }
**/

    override fun onClick(v: View?) {
        when (v) {
            buttonPlace1 -> {

                if (queue) {
                    buttonPlace1.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace1.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace2 -> {

                if (queue) {
                    buttonPlace2.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace2.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace3 -> {

                if (queue) {
                    buttonPlace3.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace3.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace4 -> {
                if (queue) {
                    buttonPlace4.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace4.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace5 -> {
                if (queue) {
                    buttonPlace5.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace5.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace6 -> {
                if (queue) {
                    buttonPlace6.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace6.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace7 -> {
                if (queue) {
                    buttonPlace7.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace7.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
            buttonPlace8 -> {
                if (queue) {
                    buttonPlace8.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace8.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }

            }
            buttonPlace9 -> {
                if (queue) {
                    buttonPlace9.setBackgroundResource(R.drawable.ic_x)
                    queue = false
                } else {
                    buttonPlace9.setBackgroundResource(R.drawable.ic_o)
                    queue = true
                }
            }
        }
    }
}