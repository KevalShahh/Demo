package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.example.demo.databinding.ActivityVariousComponentsBinding
import java.lang.StringBuilder

class VariousComponents : AppCompatActivity() {
    lateinit var viewBinding:ActivityVariousComponentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityVariousComponentsBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
        var msg=""

        viewBinding.radioGrp.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radio_male-> Toast.makeText(this, "Selected : Male", Toast.LENGTH_SHORT).show()
                R.id.radio_female-> Toast.makeText(this, "Selected : Female", Toast.LENGTH_SHORT).show()
            }
        }
        var stringBuilder= StringBuilder(String())
        stringBuilder.append("clg")
        stringBuilder.append("School")
        Toast.makeText(this, ""+stringBuilder, Toast.LENGTH_SHORT).show()
        viewBinding.btnCheck.setOnClickListener {
            if(viewBinding.cbClg.isChecked){
                msg = msg + " Clg "}
            if(viewBinding.cbSchool.isChecked){
                msg = msg + " School "}
            if(viewBinding.cbAndroid.isChecked){
                msg = msg + " android "}
            if(viewBinding.cbCss.isChecked){
                msg = msg + " css "}
            if(viewBinding.cbHtml.isChecked){
                msg = msg + " html "}
            if(viewBinding.cbJava.isChecked){
                msg = msg + " java "}
            if(viewBinding.cbJs.isChecked){
                msg = msg + " javascript "}
            if(viewBinding.cbKotlin.isChecked){
                msg = msg + " kotlin "}
            if(viewBinding.cbPython.isChecked){
                msg = msg + " python "}
            if(viewBinding.cbXml.isChecked){
                msg = msg + " xml "}
            Toast.makeText(this, msg+"are selected", Toast.LENGTH_LONG).show()
        }

    }
}