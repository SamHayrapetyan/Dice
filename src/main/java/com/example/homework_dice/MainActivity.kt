package com.example.homework_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var random = (1..6).random()
        val image: ImageView = findViewById(R.id.imageView)
        val buttonRoll: Button = findViewById(R.id.buttonRoll)
        buttonRoll.setOnClickListener {
            when (random) {
                1 -> {
                    image.setImageResource(R.drawable.one)
                    random = (1..6).random()
                }
                2 -> {
                    image.setImageResource(R.drawable.two)
                    random = (1..6).random()
                }
                3 -> {
                    image.setImageResource(R.drawable.tree)
                    random = (1..6).random()
                }
                4 -> {
                    image.setImageResource(R.drawable.four)
                    random = (1..6).random()
                }
                5 -> {
                    image.setImageResource(R.drawable.five)
                    random = (1..6).random()
                }
                6-> {
                    image.setImageResource(R.drawable.six)
                    random = (1..6).random()
                }
            }
        }
    }
}