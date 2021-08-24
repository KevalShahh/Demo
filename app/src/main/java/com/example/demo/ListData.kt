package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.demo.databinding.ActivityListDataBinding

class ListData : AppCompatActivity() {
    lateinit var viewBinding:ActivityListDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityListDataBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.tvData.text=intent.getStringExtra("text").toString()
    }
}