package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.et_number_1)
        val etNumber2 = findViewById<EditText>(R.id.et_number_2)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        // Operasi matematika
        val buttonPlus = findViewById<Button>(R.id.btn_plus)
        val buttonMinus = findViewById<Button>(R.id.btn_minus)
        val buttonAnd = findViewById<Button>(R.id.btn_and)
        val buttonFor = findViewById<Button>(R.id.btn_for)

        buttonPlus.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()

            val result = number1 + number2
            tvResult.text = result.toString()
        }

        buttonMinus.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()

            val result = number1 - number2
            tvResult.text = result.toString()
        }

        buttonAnd.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()

            val result = number1 * number2
            tvResult.text = result.toString()
        }

        buttonFor.setOnClickListener {
            val number1 = etNumber1.text.toString().toFloat()
            val number2 = etNumber2.text.toString().toFloat()

            val result = number1 / number2
            tvResult.text = result.toString()
        }


    }
}