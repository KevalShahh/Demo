package com.example.demo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import com.example.demo.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var viewBinding:ActivityMain3Binding
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain3Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        sharedPreferences=getSharedPreferences("shared", MODE_PRIVATE)
        viewBinding.tv1.setText(sharedPreferences.getString("namee","").toString())
        viewBinding.tv2.setText(sharedPreferences.getString("age","").toString())
        viewBinding.tv3.setText(sharedPreferences.getString("number","").toString())
    }
}