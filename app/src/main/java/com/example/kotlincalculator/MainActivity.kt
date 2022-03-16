package com.example.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1:EditText=findViewById(R.id.edt1)
        val number2:EditText=findViewById(R.id.edt2)
        val result:TextView=findViewById(R.id.cc_result)
        val btnAdd:Button=findViewById(R.id.button)
        val btnMinus:Button=findViewById(R.id.button2)
        val btnMulti:Button=findViewById(R.id.button3)
        val btnDiv:Button=findViewById(R.id.button4)

        btnAdd.setOnClickListener {
            val number1:Int= Integer.parseInt(number1.text.toString())
            val number2:Int= Integer.parseInt(number2.text.toString())
            val iresult = number1+number2
            result.text=iresult.toString()
        }

        btnMinus.setOnClickListener {
            val number1:Int= Integer.parseInt(number1.text.toString())
            val number2:Int= Integer.parseInt(number2.text.toString())
            val iresult = number1-number2
            result.text=iresult.toString()
        }
        btnMulti.setOnClickListener {
            val number1:Int= Integer.parseInt(number1.text.toString())
            val number2:Int= Integer.parseInt(number2.text.toString())
            val iresult = number1*number2
            result.text=iresult.toString()
        }
        btnDiv.setOnClickListener {
            val number1:Int= Integer.parseInt(number1.text.toString())
            val number2:Int= Integer.parseInt(number2.text.toString())
            if (number2 > 0 ){
                val iresult = number1/number2
                result.text=iresult.toString()

            } else {
                val iresult = 0
                result.text=iresult.toString()
            }

        }

    }
}