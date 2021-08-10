package com.example.kotlingridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var name:Array<String>,var image:Array<Int>,var price:Array<Float>,var context: Context):BaseAdapter() {

    override fun getCount(): Int {
       return  name.size
           }

    override fun getItem(position: Int): Any {
        return name.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater: LayoutInflater= LayoutInflater.from(parent?.context)
        var view:View=inflater.inflate(R.layout.single_row,parent,false)
        var imageView:ImageView=view.findViewById(R.id.food)
        var foodName:TextView=view.findViewById(R.id.foodname)
        var foodPrice:TextView=view.findViewById(R.id.price)
        imageView.setImageResource(image.get(position))
        foodName.setText(name.get(position))
        foodPrice.setText(price.get(position).toString())
        return view
    }
}