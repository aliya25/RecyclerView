package com.example.recylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BiodataAdapter (private val context: Context, private val Biodata : List<Biodata>, val listener: (Biodata) -> Unit)
    : RecyclerView.Adapter<BiodataAdapter.LaguViewHolder>(){

    class LaguViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgBiodata = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBiodata = view.findViewById<TextView>(R.id.tv_item_name)
        val descBiodata = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(biodata: Biodata, listener: (Biodata) -> Unit) {
            imgBiodata.setImageResource(biodata.imgBiodata)
            nameBiodata.text = biodata.nameBiodata
            descBiodata.text = biodata.descBiodata
            itemView.setOnClickListener{
                listener(biodata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaguViewHolder {
        return LaguViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_biodata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LaguViewHolder, position: Int) {
        holder.bindView(Biodata[position], listener)
    }

    override fun getItemCount(): Int = Biodata.size
}