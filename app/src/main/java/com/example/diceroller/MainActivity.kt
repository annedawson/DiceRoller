package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    /*
here at 10 Jan 2021, 12:48 PT, AD
here at 12 Jan 2021, 9:54 PT, AD
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button) // get a REFERENCE to the button
        // so that you can assign to it later on...

        // below is a dynamic assignment to change the text of the button (optional in this project)
        //rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}