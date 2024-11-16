package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)


        val editText1 : EditText =findViewById(R.id.editText)
        val editText2 : EditText =findViewById(R.id.editText1)
        val textView : TextView =findViewById(R.id.textView3)
        val button : Button =findViewById(R.id.button)

        button.setOnClickListener {
            var radius = editText1.text.toString()
            var height = editText2.text.toString()

            var r=Integer.parseInt(radius)
            var h=Integer.parseInt(height)

            var volume = 3.14*r*r*h
            textView.text="Volume = $volume  m3"

        }
    }
}