package com.example.kotlingridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
lateinit var  gridView:GridView
lateinit var name:Array<String>
lateinit var image:Array<Int>
lateinit var price:Array<Float>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name= arrayOf("Dosa","Idli","Pizza","Pasta","Soup","Pulav","Biryani","Pooha")
        image = arrayOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h)
        price= arrayOf(60.00f,20.00f,150.00f,120.00f,50.00f,160.00f,180.00f,30.00f)
        gridView=findViewById(R.id.grid)
        gridView.adapter=CustomAdapter(name,image,price,this)

    }
}