package com.putragandad.multiplerv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.multiplerv.Model.Promotion
import com.putragandad.multiplerv.databinding.ItemPromotionBinding

class PromotionAdapter(private val PromotionList : ArrayList<Promotion>) :
    RecyclerView.Adapter<PromotionAdapter.promotionViewHolder>() {

    inner class promotionViewHolder(val binding: ItemPromotionBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivAlbum : ImageView = binding.ivPromoteAlbum
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): promotionViewHolder {
        val binding = ItemPromotionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return promotionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return PromotionList.size
    }

    override fun onBindViewHolder(holder: promotionViewHolder, position: Int) {
        val promotion = PromotionList[position]
        holder.ivAlbum.setImageResource(promotion.image)
    }
}