package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityGizeBinding
import com.google.android.gms.maps.model.LatLng

class GizeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGizeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGizeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(29.9759466,31.128662)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }

        binding.buttonNext.setOnClickListener{
            val next = Intent(this,ArtemisActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, JardinActivity::class.java)
            startActivity(back)
        }
    }
}