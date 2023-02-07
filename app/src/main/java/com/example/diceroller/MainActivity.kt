package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener(){
            rollDice()
        }

        val countUp: Button = findViewById(R.id.count_up_button)

        countUp.setOnClickListener{
            countUp()
        }
    }

    private fun rollDice(){

        val randomInt: Int = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()

        Toast.makeText( this, "Button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun countUp(){

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

    }
}