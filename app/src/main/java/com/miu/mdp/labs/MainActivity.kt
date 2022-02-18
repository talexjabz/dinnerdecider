package com.miu.mdp.labs

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.miu.mdp.labs.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    private val foodsList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.btnDecide.setOnClickListener {
            val random = Random.nextInt(foodsList.size)
            mainBinding.foodChoice.text = foodsList[random]
        }

        mainBinding.addFood.setOnClickListener {
            val newFood = mainBinding.foodEditText.text.toString()

            if (newFood.isEmpty()) return@setOnClickListener
            foodsList.add(newFood)
            mainBinding.foodEditText.clear()
        }
    }
}

private fun EditText.clear() {
    this.setText("")
}
