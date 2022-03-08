package com.example.todolist

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.marginLeft
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    fun setName() {

        val inputField = findViewById<EditText>(R.id.textInput)
        val outputField = findViewById<LinearLayout>(R.id.displayEntry)
        if( inputField.text.isNotEmpty() ) {
            val entry = TextView(this)
            entry.text = inputField.text
            entry.textSize = 26.0F
            entry.setTextColor(Color.BLACK)
            entry.setPadding(26, 10, 0, 10)
            outputField.addView(entry,0)
            inputField.setText("")
            println("function is true")
        }
        println("Function called")




    }
    fun changeScreen(){
        setContentView(R.layout.screen_2)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val setBtn = findViewById<Button>(R.id.setUserBtn)
        val changeScreenBtn = findViewById<Button>(R.id.changeScreenBtn)
        setBtn.setOnClickListener {  view -> setName() }
        changeScreenBtn.setOnClickListener { view -> changeScreen() }

    }
}