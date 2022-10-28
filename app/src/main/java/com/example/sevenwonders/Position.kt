package com.example.sevenwonders

import android.os.Parcel
import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng

data class Position(var place: LatLng?):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readParcelable(LatLng::class.java.classLoader)) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel?, p1: Int) {
        parcel?.writeParcelable(place,1)
    }

    companion object CREATOR : Parcelable.Creator<Position> {
        override fun createFromParcel(parcel: Parcel): Position {
            return Position(parcel)
        }

        override fun newArray(size: Int): Array<Position?> {
            return arrayOfNulls(size)
        }
    }
}


