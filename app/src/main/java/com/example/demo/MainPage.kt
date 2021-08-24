package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.demo.databinding.ActivityMainPageBinding

class MainPage : AppCompatActivity() {
    lateinit var viewBinding:ActivityMainPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMainPageBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.btnAlertDemo.setOnClickListener {
            startActivity(Intent(this,AlertDialog::class.java))
        }
        viewBinding.btnBlogworx.setOnClickListener {
            startActivity(Intent(this,Blogworx::class.java))
        }
        viewBinding.btnContactRecycler.setOnClickListener {
            startActivity(Intent(this,ContactRecyclerView::class.java))
        }
        viewBinding.btnCustomAlert.setOnClickListener {
            startActivity(Intent(this,Alert::class.java))
        }
        viewBinding.btnDatePicker.setOnClickListener {
            startActivity(Intent(this,DatePicker::class.java))
        }
        viewBinding.btnLoginShared.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        viewBinding.btnLogo.setOnClickListener {
            startActivity(Intent(this,logo::class.java))
        }
        viewBinding.btnRecycler.setOnClickListener {
            startActivity(Intent(this,RecyclerViewDemo::class.java))
        }
        viewBinding.btnSpinner.setOnClickListener {
            startActivity(Intent(this,Spinner::class.java))
        }
        viewBinding.btnVarious.setOnClickListener {
            startActivity(Intent(this,VariousComponents::class.java))
        }
    }
}