package com.example.midcustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<models>()

        //adding images
        list.add(models("GTR","This is a gtr car", R.drawable.gtr))
        list.add(models("INSTAGRAM","This is a social media app called instagram", R.drawable.instagram))
        list.add(models("PIZZA","This is a food called pizza", R.drawable.pizza))
        list.add(models("PIZZA","This is a food called pizza", R.drawable.pizza10))
        list.add(models("PIZZA","This is a food called pizza", R.drawable.pizza3))
        list.add(models("ORANGE","This is a fruit called orange", R.drawable.orange))



        listView.adapter = MyAdapter(this, R.layout.row, list)
    }
}