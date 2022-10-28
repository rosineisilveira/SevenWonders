package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityFarolBinding
import com.google.android.gms.maps.model.LatLng

class FarolActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFarolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarolBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(31.2132465,27.6439888)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }
        binding.buttonNext.setOnClickListener{
            val next = Intent(this,ZeusActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, MausoleuActivity::class.java)
            startActivity(back)
        }
    }
}