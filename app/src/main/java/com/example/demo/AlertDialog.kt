package com.example.demo

import android.app.AlertDialog.THEME_HOLO_LIGHT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.demo.databinding.ActivityAlertDialogBinding

class AlertDialog : AppCompatActivity() {
    lateinit var viewBinding:ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityAlertDialogBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        viewBinding.btnDelete.setOnClickListener {
            AlertDialog.Builder(this,R.style.Theme_AppCompat_Dialog_Alert)
                .setMessage(R.string.Message)
                .setPositiveButton("Delete"){_,_->
                    Toast.makeText(this, "deleted", Toast.LENGTH_SHORT).show()
                }
                .setNeutralButton("cancel",null)
                .show()
        }
    }
}