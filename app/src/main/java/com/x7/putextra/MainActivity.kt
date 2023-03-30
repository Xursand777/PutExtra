package com.x7.putextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.putextra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            cardview1.setOnClickListener {
                val intent=Intent(this@MainActivity,MainActivity2::class.java)
                intent.putExtra("phone",R.drawable.iphone14)
                intent.putExtra("text",textviewcar.text.toString())
                intent.putExtra("textdes",textviewcardescription.text.toString())
                startActivity(intent)
            }
            cardview2.setOnClickListener {
                val intent=Intent(this@MainActivity,MainActivity2::class.java)
                intent.putExtra("phone",R.drawable.car1)
                intent.putExtra("text",textviewcar2.text.toString())
                intent.putExtra("textdes",textviewcardescrioption2.text.toString())
                startActivity(intent)
            }
            cardview3.setOnClickListener {
                val intent=Intent(this@MainActivity,MainActivity2::class.java)
                intent.putExtra("phone",R.drawable.car2)
                intent.putExtra("text",textviewcar3.text.toString())
                intent.putExtra("textdes",textviewcardescrioption3.text.toString())
                startActivity(intent)
            }

        }



    }
}