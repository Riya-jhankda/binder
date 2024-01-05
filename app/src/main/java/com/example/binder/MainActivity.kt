package com.example.binder

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.binder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            if(binding.checkbox.isChecked){
                //open a new screenn
                //which we are not doing rn
            }
            else{
                binding.checkbox.buttonTintList= ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Please tick mark the T&C first",Toast.LENGTH_SHORT).show()
            }
        }

    }
}