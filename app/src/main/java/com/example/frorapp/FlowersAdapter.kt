package com.example.frorapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_flower.view.*

class FlowersAdapter(private val mContext: Context, private val listFrowers: List<Flower>):
    ArrayAdapter<Flower>(mContext, 0, listFrowers) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.activity_flower, parent, false)
        val flower = listFrowers[position]

        layout.txtName.text = flower.name
        layout.txtDescription.text = flower.description
        layout.imgFlower.setImageResource(flower.image)

        return layout
    }
}
