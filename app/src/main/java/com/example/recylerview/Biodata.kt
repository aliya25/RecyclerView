package com.example.recylerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Biodata(
    val imgBiodata: Int,
    val nameBiodata: String,
    val descBiodata: String,
) : Parcelable
