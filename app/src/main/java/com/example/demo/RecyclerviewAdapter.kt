package com.example.demo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewAdapter(var context: Context, private var title: Array<String>, private var listner:OnCustomListItemSelected) :
    RecyclerView.Adapter<RecyclerviewAdapter.viewHolder>() {

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textview = itemView.findViewById<TextView>(R.id.tv_rv)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.activity_custom_recycler_list_view,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.textview.text=title[position]
        holder.itemView.setOnClickListener {
            listner.getSelectedItem(title[position])
            var intent=Intent(context,ListData::class.java)
            intent.putExtra("text",holder.textview.text)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return title.size
    }
}