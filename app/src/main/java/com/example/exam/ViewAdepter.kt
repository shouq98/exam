package com.example.exam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewAdepter(private val img:List<Int>): RecyclerView.Adapter<ViewAdepter.ViewHolder>()  {
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val imageView:ImageView=itemView.findViewById(R.id.viewImage)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAdepter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(Holder: ViewAdepter.ViewHolder, position:Int) {
        val currentImg = img[position]
        Holder.imageView.setImageResource(currentImg)
    }

    override fun getItemCount(): Int {
        return img.size
    }

}