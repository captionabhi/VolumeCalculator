package com.example.volumecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val textView: TextView = findViewById(R.id.textView2)
        val result: TextView = findViewById(R.id.textView3)
        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)


        button.setOnClickListener {
            var length = editText.text.toString()
            var l = Integer.parseInt(length)

            var volume = l * l * l
            result.text = "Volume = $volume  m3"
        }
    }
}