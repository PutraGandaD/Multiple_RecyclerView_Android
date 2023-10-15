package com.putragandad.multiplerv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.multiplerv.Model.Promotion
import com.putragandad.multiplerv.Model.Revisit
import com.putragandad.multiplerv.databinding.ItemPromotionBinding
import com.putragandad.multiplerv.databinding.ItemRevisitartistBinding

class RevisitAdapter(private val revisitList: ArrayList<Revisit>) :
    RecyclerView.Adapter<RevisitAdapter.revisitViewHolder>() {

    inner class revisitViewHolder(val binding: ItemRevisitartistBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivCover : ImageView = binding.tvRevisitCover
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): revisitViewHolder {
        val binding = ItemRevisitartistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return revisitViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return revisitList.size
    }

    override fun onBindViewHolder(holder: RevisitAdapter.revisitViewHolder, position: Int) {
        val revisit = revisitList[position]
        holder.ivCover.setImageResource(revisit.Image)
    }
}