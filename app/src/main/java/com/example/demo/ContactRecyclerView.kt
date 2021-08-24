package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.databinding.ActivityContactRecyclerViewBinding

class ContactRecyclerView : AppCompatActivity() {
    lateinit var viewBinding:ActivityContactRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityContactRecyclerViewBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)

        var image= arrayOf(R.drawable.joe,R.drawable.bill,R.drawable.mark,R.drawable.marisa,R.drawable.sundar,R.drawable.jeff)
        var name= arrayOf("Joe Belfiore","Bill Gates","Mark zuckerberg","Marissa Mayer","Sunder Pichai","Jeff Bezos")
        var descriptiom= arrayOf("in a world for away","what am i doing here?","really busy,whatsapp only","in a rush to catch a place","do something","forgive everyone")
        var contactRecyclerviewAdapter=ContactRecyclerviewAdapter(this,image,name,descriptiom)
        viewBinding.rvContact.adapter=contactRecyclerviewAdapter
        viewBinding.rvContact.layoutManager=LinearLayoutManager(this)
    }
}