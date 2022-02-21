package com.miu.mdp.labs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val options = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide_button.setOnClickListener {
            val random = Random.nextInt(options.size)
            food_choice.text = options[random]
        }

        add_food_button.setOnClickListener {
            val newFood = edit_text.text.toString()
            options.add(newFood)
            edit_text.setText("")
            Toast.makeText(this, "Added food!",Toast.LENGTH_SHORT).show()
        }
    }
}
