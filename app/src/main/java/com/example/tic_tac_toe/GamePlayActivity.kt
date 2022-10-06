package com.example.tic_tac_toe

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.tic_tac_toe.customviews.TicTacToeView

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

    private var ticTacToeView:TicTacToeView?= null

    private var queue: Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ticTacToeView = findViewById(R.id.ticTacToeView)
        val getPlayer1name = intent.getStringExtra("player1name").toString()
        val getPlayer2name = intent.getStringExtra("player1name").toString()

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


    override fun onClick(v: View?) {
        if (queue) {
            v?.setBackgroundResource(R.drawable.ic_x)
            queue = false
        } else {
            v?.setBackgroundResource(R.drawable.ic_o)
            queue = true
        }
    }
}
