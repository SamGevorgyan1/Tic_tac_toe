package com.example.tic_tac_toe

import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton


class StartGameActivity : AppCompatActivity() {

    lateinit var buttonPlay: AppCompatButton
    lateinit var player1_name: EditText
    lateinit var player2_name: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_game_activity)

        buttonPlay = findViewById(R.id.buttonPlay)

        player1_name=findViewById(R.id.player1)
        player2_name=findViewById(R.id.player2)
        showSoftKeyboard(player1_name)
        showSoftKeyboard(player2_name)

        buttonPlay.setOnClickListener {
            val intent = Intent(this, GamePlayActivity::class.java)

            intent.putExtra("player1name",player1_name.text.toString())
            intent.putExtra("player2name",player2_name.text.toString())
            startActivity(intent)
        }


    }
    private fun showSoftKeyboard(view: View) {
        if (view.requestFocus()) {
            val inputMethodManager: InputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
        }
    }
}