package com.example.demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.demo.databinding.ActivityLogoBinding

class logo : AppCompatActivity() {
    lateinit var viewBinding:ActivityLogoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityLogoBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
        supportFragmentManager.beginTransaction().replace(R.id.frame,LoginFragment()).commit()
        viewBinding.btnLog.setOnClickListener {
           supportFragmentManager.beginTransaction().replace(R.id.frame,LoginFragment()).commit()
        }
        viewBinding.btnSign.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame,SignUpFragment()).commit()
        }
    }
}