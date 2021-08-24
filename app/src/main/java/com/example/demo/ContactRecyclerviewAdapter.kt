package com.example.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.ContactRecyclerviewAdapter.*

class ContactRecyclerviewAdapter(var context: Context,var image: Array<Int>,var name: Array<String>,var description:Array<String>) : RecyclerView.Adapter<ContactViewHolder>() {
    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView=itemView.findViewById<TextView>(R.id.tv_name)
        var textView1=itemView.findViewById<TextView>(R.id.tv_desc)
        var imageview=itemView.findViewById<ImageView>(R.id.iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.activity_custom_contact_list,parent,false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.textView.text=name[position]
        holder.textView1.text=description[position]
        holder.imageview.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }
}
