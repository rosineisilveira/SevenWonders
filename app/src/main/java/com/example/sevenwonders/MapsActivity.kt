package com.example.sevenwonders

import android.content.Intent.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat.getExtras
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        mapFragment.getMapAsync{
            googleMap ->addMarkers(googleMap)
        }

    }

    private fun addMarkers(googleMap: GoogleMap) {
        var place = intent.getParcelableExtra<Position>("pos")
        //val marker = place?.place?.let { MarkerOptions().position(it) }
           // ?.let { googleMap.addMarker(it) }
        //val marker = googleMap.addMarker(MarkerOptions().position(place?.place!!))
        googleMap.addMarker(MarkerOptions()
            .position(place?.place!!))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place?.place!!, 12.0F))



    }

}
