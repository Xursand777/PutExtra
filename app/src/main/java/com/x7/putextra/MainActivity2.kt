package com.x7.putextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.putextra.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent

        val image=  intent.getIntExtra("phone",0)
        val text=intent.getStringExtra("text")
        val textdes= intent.getStringExtra("textdes")
        binding.imageview.setImageResource(image)
        binding.textview.text=text
        binding.textviewdes.text=textdes


    }
}