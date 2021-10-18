package com.example.recylerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailBiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_biodata)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val lagu = intent.getParcelableExtra<Biodata>(MainActivity.INTENT_PARCELABLE)

        val imgLagu = findViewById<ImageView>(R.id.img_item_photo)
        val nameLagu = findViewById<TextView>(R.id.tv_item_name)
        val descLagu = findViewById<TextView>(R.id.tv_item_description)

        imgLagu.setImageResource(lagu?.imgBiodata!!)
        nameLagu.text = lagu.nameBiodata
        descLagu.text = lagu.descBiodata

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}