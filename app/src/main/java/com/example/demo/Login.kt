package com.example.demo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    lateinit var sharedPreferences:SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var name=findViewById<EditText>(R.id.et)
        var pass=findViewById<EditText>(R.id.et2)
        var btn=findViewById<Button>(R.id.login)

        sharedPreferences=getSharedPreferences("demo", MODE_PRIVATE)
        editor=sharedPreferences.edit()

        btn.setOnClickListener {
            editor.putString("name",name.text.toString())
            editor.putString("pass",pass.text.toString())
            editor.apply()
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        if (sharedPreferences.contains("name"))
        {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}