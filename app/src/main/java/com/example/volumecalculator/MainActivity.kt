package com.example.volumecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val gridView: GridView = findViewById(R.id.gridView)

        var shape1: Shape = Shape(R.drawable.sphear, "Sphere")
        var shape2 = Shape(R.drawable.cube, "Cube")
        var shape3 = Shape(R.drawable.prism, "Prism")
        var shape4 = Shape(R.drawable.cylinder, "Cylinder")

        val gridItems = listOf<Shape>(
            shape1, shape2, shape3, shape4
        )
        val customAdapter = MyCustomAdapter(this, gridItems)
        gridView.adapter = customAdapter


        gridView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = customAdapter.getItem(position)

            if (clickedItem?.shapeName.equals("Sphere")) {
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)

            } else if (clickedItem?.shapeName.equals("Cube")) {
                val i = Intent(this, CubeActivity::class.java)
                startActivity(i)

            } else if (clickedItem?.shapeName.equals("Prism")) {
                val i = Intent(this, PrismActivity::class.java)
                startActivity(i)

            }
            else if(clickedItem?.shapeName.equals("Cylinder")){
                val i =Intent(this,CylinderActivity::class.java)
                startActivity(i)

        }
    }
}
}