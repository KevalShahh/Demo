package com.example.demo

import android.content.DialogInterface
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StyleRes
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnn)
        var text1 = findViewById<TextView>(R.id.hello)

        sharedPreferences=getSharedPreferences("demo", MODE_PRIVATE)
        var name=sharedPreferences.getString("name","")
        btn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(R.string.alert)
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage(R.string.message)
                .setPositiveButton("Yes") { _, _ ->
                    text1.setText("Welcome"+" "+name.toString())
                    Toast.makeText(this, "Text Changed", Toast.LENGTH_SHORT).show()
                }.setNegativeButton("No", null)
                .setNeutralButton("Cancel"){_,_,->
                    Toast.makeText(this, "cancelled", Toast.LENGTH_SHORT).show()
                }
                .show()

        }
    }
}