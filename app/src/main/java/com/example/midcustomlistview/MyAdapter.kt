package com.example.midcustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mycntx: Context, var resources: Int, var items:List<models>): ArrayAdapter<models>(mycntx, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutinflater: LayoutInflater = LayoutInflater.from(mycntx)
        val view: View = layoutinflater.inflate(resources, null)
        val imageView: ImageView = view.findViewById(R.id.image)
        val tv_title: TextView = view.findViewById(R.id.Tv_maintext)
        val tv_decription: TextView = view.findViewById(R.id.Tv_subtext)

        var myitems: models = items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        tv_title.text = myitems.title
        tv_decription.text = myitems.description

        return view
    }
}