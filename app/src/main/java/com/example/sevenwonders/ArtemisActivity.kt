package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityArtemisBinding
import com.google.android.gms.maps.model.LatLng

class ArtemisActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityArtemisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtemisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(37.9493601,27.3616675)
            )
            next.putExtra("pos",place)
            startActivity(next)
        }
        binding.buttonNext.setOnClickListener{
            val next = Intent(this,RhodesActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, GizeActivity::class.java)
            startActivity(back)
        }
    }
}