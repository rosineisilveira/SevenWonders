package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityRhodesBinding
import com.google.android.gms.maps.model.LatLng

class RhodesActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityRhodesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRhodesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(36.4510912,28.2245394)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }

        binding.buttonNext.setOnClickListener{
            val next = Intent(this,MausoleuActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, ArtemisActivity::class.java)
            startActivity(back)
        }
    }
}