package com.example.demo

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.demo.databinding.ActivityDatePickerBinding
import java.text.SimpleDateFormat
import java.util.*

class DatePicker : AppCompatActivity() {
    lateinit var viewBinding:ActivityDatePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityDatePickerBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
        viewBinding.btnDate.setOnClickListener {
            var c = Calendar.getInstance()
            var year = c.get(Calendar.YEAR)
            var month = c.get(Calendar.MONTH)
            var day = c.get(Calendar.DATE)
            var dialog = DatePickerDialog(this,
                AlertDialog.THEME_DEVICE_DEFAULT_DARK,
                DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val cal = Calendar.getInstance()
                    cal.set(Calendar.DATE,day)
                    cal.set(Calendar.YEAR, year)
                    cal.set(Calendar.MONTH, month)
                    viewBinding.tvDate.setText(SimpleDateFormat("YYYY/MM/dd").format(cal.time).toString())
                }, year, month, day)
            dialog.datePicker.minDate=System.currentTimeMillis()
            dialog.show()
        }
        viewBinding.btnTime.setOnClickListener {
            var t=Calendar.getInstance()
            var hr=t.get(Calendar.HOUR)
            var min=t.get(Calendar.MINUTE)
            var timePickerDialog= TimePickerDialog(this,
                AlertDialog.THEME_HOLO_DARK,
                TimePickerDialog.OnTimeSetListener { view, hr, min ->
                    var time=Calendar.getInstance()
                    time.set(Calendar.HOUR,hr)
                    time.set(Calendar.MINUTE,min)
                    viewBinding.tvTime.setText(SimpleDateFormat("hh:mm:ss aaa").format(time.time))
                },hr,min,true)
            timePickerDialog.show()
        }
        viewBinding.btnDateTime.setOnClickListener {
            var c = Calendar.getInstance()
            var year = c.get(Calendar.YEAR)
            var month = c.get(Calendar.MONTH)
            var day = c.get(Calendar.DATE)
            var hr=c.get(Calendar.HOUR)
            var min=c.get(Calendar.MINUTE)
            var dialog = DatePickerDialog(this,
                AlertDialog.THEME_HOLO_LIGHT,
                DatePickerDialog.OnDateSetListener { view, year, month, day ->
                    val cal = Calendar.getInstance()
                    cal.set(Calendar.DATE,day)
                    cal.set(Calendar.YEAR, year)
                    cal.set(Calendar.MONTH, month)
                    var timePickerDialog= TimePickerDialog(this,
                        AlertDialog.THEME_DEVICE_DEFAULT_DARK,
                        TimePickerDialog.OnTimeSetListener { view, hr, min ->
                            var time=Calendar.getInstance()
                            time.set(Calendar.HOUR,hr)
                            time.set(Calendar.MINUTE,min)
                            viewBinding.tvDateTime.setText(SimpleDateFormat("dd MMMM YYYY").format(cal.time)+","+SimpleDateFormat("hh:mm aaa").format(time.time).toString())
                        },hr,min,true)
                    timePickerDialog.show()
                }, year, month, day)
            dialog.show()
        }
    }
}