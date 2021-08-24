package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.demo.databinding.ActivityRecyclerViewDemoBinding
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class RecyclerViewDemo : AppCompatActivity(), OnCustomListItemSelected {
    private lateinit var viewBinding: ActivityRecyclerViewDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityRecyclerViewDemoBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        val title = arrayOf(
            "android",
            "java",
            "kotlin",
            "recycler",
            "alert",
            "custom",
            "login",
            "logo",
            "signup",
            "list",
            "dialog",
            "layout",
            "frame",
            "linear",
            "grid",
            "constraint"
        )
        val recyclerviewAdapter = RecyclerviewAdapter(this, title, this)
        viewBinding.rv.adapter = recyclerviewAdapter
        viewBinding.rv.layoutManager = LinearLayoutManager(this)
    }

    override fun getSelectedItem(s: String) {
        Toast.makeText(this, "Text : $s", Toast.LENGTH_SHORT).show()
    }
}