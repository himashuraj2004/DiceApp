package com.example.happyrakshabandhan

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.text = "roll it"

        rollButton.setOnClickListener {
            dice1()
            dice2()
            val textView1: TextView=findViewById(R.id.textView)
            val textView2: TextView=findViewById(R.id.textView4)

            val roll1=textView1.text.toString().toInt()
            val roll2=textView2.text.toString().toInt()

            if(roll1==roll2){
                greet()
            }
            else {

                remove()
            }
        }
    }
    private fun dice1() {
        val Dice = dice(6)
        val diceroll = Dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceroll.toString()
    }
    private fun dice2() {
        val Dice = dice(6)
        val diceroll = Dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView4)
        resultTextView.text = diceroll.toString()
    }
    private fun greet(){
            val resultTextView: TextView=findViewById(R.id.textView2)
            resultTextView.text="Hooraayy!!!"
        }
    private fun remove(){
        val removegreet: TextView=findViewById(R.id.textView2)
         removegreet.text=""
    }
    }
class dice(val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }

}

