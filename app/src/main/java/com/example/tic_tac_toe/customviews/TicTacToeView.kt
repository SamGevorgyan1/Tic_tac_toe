package com.example.tic_tac_toe.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.tic_tac_toe.R

class TicTacToeView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {
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
    init {
        LayoutInflater.from(context).inflate(R.layout.tic_tac_toe_view,this,true)
    }



}