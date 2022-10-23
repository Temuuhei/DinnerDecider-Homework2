package com.example.dinnerdecider_homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        // code here

        var foodList: ArrayList<String> = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Mongolian" )

        fun decideFood(view: View) {
            println("Temka decide food")
            result_txt.text = foodList.asSequence().shuffled().find { true }
        }

        fun addFood(view: View) {
            println("Temka")
            foodList.add(add_food_txt.text.toString())
            add_food_txt.text.clear()
        }
}