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

    lateinit var diceImage: ImageView


    // Note the activity lifecycle, onCreate happens one time only,
    // after the activity has been launched.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) // get a REFERENCE to the button
        // note this happens only ***one time*** in the life of the app

        // below is a dynamic assignment to change the text of the button (optional in this project)
        //rollButton.text = "Let's Roll"

        // setOnClickListeners when the app is created (i.e. in onCreate())
        // note - the {} below is a lambda
        // A shorthand of a single argument lambda is to use the keyword ‘it’.
        // This value represents any lone that argument we pass to the lambda function.
        rollButton.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        // The above code essentially is describing what must be done on click of the button
        // which is to call rollDice().
        // Note: this can be done when in the design mode for activity_main.xml but
        // writing the code like this is much for natural for me.

        diceImage= findViewById(R.id.dice_image)
    }

    private fun rollDice() {

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