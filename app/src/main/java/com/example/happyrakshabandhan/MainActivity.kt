package com.example.happyrakshabandhan

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        }
        dice1()
        dice2()
    }

    private fun dice2() {
        val Dice=dice(6)
        val roll=Dice.roll()

        val diceImage: ImageView=findViewById(R.id.imageView2)
        val drawableResource=when(roll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = roll.toString()

    }

    /* Roll the dice and update the screen with the result.*/
    private fun dice1() {
        val Dice = dice(6) //creating a new dice with 6 sides
        val diceroll = Dice.roll()

        //find the imageView by giving the address
        val diceImage: ImageView = findViewById(R.id.imageView)

        //determining which dice face should be displayed with its resource ID
        val drawableResource = when (diceroll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //update the imgaeView with correct drawable object
        diceImage.setImageResource(drawableResource)

        //update the content description
        diceImage.contentDescription = diceroll.toString()
    }

}

    class dice(val sides: Int) {
        fun roll(): Int {
            return (1..sides).random()
        }

    }


