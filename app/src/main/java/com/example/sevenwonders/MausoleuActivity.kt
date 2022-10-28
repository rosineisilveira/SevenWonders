package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityMausoleuBinding
import com.google.android.gms.maps.model.LatLng

class MausoleuActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMausoleuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMausoleuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(37.0378874,27.4219277)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }
        binding.buttonNext.setOnClickListener{
            val next = Intent(this,FarolActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this,RhodesActivity ::class.java)
            startActivity(back)
        }
    }
}