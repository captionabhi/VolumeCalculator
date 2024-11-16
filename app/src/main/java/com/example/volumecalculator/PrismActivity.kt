package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrismActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prism)

        val editText1 : EditText=findViewById(R.id.editText)
        val editText2 : EditText=findViewById(R.id.editText1)
        val textView :TextView=findViewById(R.id.textView3)
        val button : Button=findViewById(R.id.button)

        button.setOnClickListener {
            var length = editText1.text.toString()
            var breadth = editText2.text.toString()

            var l=Integer.parseInt(length)
            var b=Integer.parseInt(breadth)

            var volume:Int = l*b
            textView.text="Volume = $volume  m3"

        }





    }
}