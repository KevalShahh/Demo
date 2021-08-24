package com.example.demo

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.demo.databinding.ActivityAlertBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Alert : AppCompatActivity() {
    lateinit var viewBinding:ActivityAlertBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityAlertBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.btnAlert.setOnClickListener {
            showdialog()
        }
       /* viewBinding.btnAlert.setOnClickListener {
           androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle(R.string.title)
                .setMessage(R.string.msg)
                .setPositiveButton(""){_,_->
                    Toast.makeText(this, "positive", Toast.LENGTH_SHORT).show()
                }.setPositiveButtonIcon(resources.getDrawable(R.drawable.ic_launcher_background))
                .setNeutralButton(""){_,_->
                    Toast.makeText(this, "Negetive", Toast.LENGTH_SHORT).show()
                }
                .setNeutralButtonIcon(resources.getDrawable(R.drawable.ic_launcher_foreground))
                .show()
        }*/
    }

    private fun showdialog() {
        var dialogView:View=LayoutInflater.from(this).inflate(R.layout.activity_custom_alert_dialog,viewBinding.root,false)
        var dialog=androidx.appcompat.app.AlertDialog.Builder(this).setView(dialogView).create()
            dialog.show()
        var edit=dialogView.findViewById<EditText>(R.id.edt)
        dialogView.findViewById<FloatingActionButton>(R.id.fb_2).setOnClickListener {
            Toast.makeText(this, ""+edit.text.toString(), Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        dialogView.findViewById<FloatingActionButton>(R.id.fb_1).setOnClickListener {
            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }
}