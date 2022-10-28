package com.example.sevenwonders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sevenwonders.databinding.ActivityCristoBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class JardinActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityCristoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCristoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMap.setOnClickListener {
            val next = Intent(this, MapsActivity::class.java)
            var place = Position(
                place = LatLng(36.3524992,42.9368308))
            next.putExtra("pos",place)
            startActivity(next)
        }


        binding.buttonNext.setOnClickListener{
            val next = Intent(this,GizeActivity::class.java)
            startActivity(next)
        }

        binding.buttonBack.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }



    }
}