package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityZeusBinding
import com.google.android.gms.maps.model.LatLng

class ZeusActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityZeusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZeusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(37.6379443,21.6280254)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }
        binding.buttonNext.setOnClickListener{
            val next = Intent(this,MainActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, FarolActivity::class.java)
            startActivity(back)
        }
    }
}