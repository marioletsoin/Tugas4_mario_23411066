package com.example.tugas2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterActivity (private val namaList : ArrayList<ItemDataActivity>): RecyclerView.Adapter<MyAdapterActivity.MyViewHolder>(){

    class  MyViewHolder (itemData: View) : RecyclerView.ViewHolder (itemData){
        val gambar : ImageView = itemData.findViewById(R.id.imageview2)
        val nama : TextView = itemData.findViewById(R.id.idnamapemainbola)
        val asal : TextView = itemData.findViewById(R.id.idasal)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_data,parent,false)
        return MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.asal.text = currentItem.asal
    }


}