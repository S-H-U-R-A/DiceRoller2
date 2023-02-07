package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            rollDice()
        }

        /*HomeWork

        val countUp: Button = findViewById(R.id.count_up_button)

        countUp.setOnClickListener{
            countUp()
        }*/
    }

    private fun rollDice(){

        val drawableResource: Int = when( (1..6).random() ){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        //Toast.makeText( this, "Button clicked", Toast.LENGTH_SHORT).show()
    }


    /*private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)

        if ( resultText.text.toString() == "Hello World!" ){
             resultText.text = "1"
        } else{

            var resultInt: Int = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }

        }

    }*/
}