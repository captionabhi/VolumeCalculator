package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val textView:TextView=findViewById(R.id.textView2)
        val result : TextView=findViewById(R.id.textView3)
        val button : Button=findViewById(R.id.button)
        val editText:EditText=findViewById(R.id.editText)


        button.setOnClickListener {
            var radius = editText.text.toString()
            var r=Integer.parseInt(radius)

            var volume = (4/3)*3.14159*r*r*r
            result.text="Volume = $volume  m3"
        }
    }
}