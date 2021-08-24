package com.example.demo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import com.example.demo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var viewBinding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMain2Binding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        sharedPreferences=getSharedPreferences("shared", MODE_PRIVATE)
        editor=sharedPreferences.edit()

        viewBinding.btnNext.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
    }

    override fun onPause() {
        super.onPause()
        editor.putString("namee",viewBinding.etName.text.toString())
        editor.putString("age",viewBinding.etAge.text.toString())
        editor.putString("number",viewBinding.etNumber.text.toString())
        editor.commit()
    }

}