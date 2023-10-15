package com.putragandad.multiplerv.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.multiplerv.Model.Trending
import com.putragandad.multiplerv.databinding.ItemMusicalbumBinding

class TrendingAdapter(private val trendingList : ArrayList<Trending>) :
    RecyclerView.Adapter<TrendingAdapter.trendingViewHolder>() {

    inner class trendingViewHolder(val binding: ItemMusicalbumBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivAlbum : ImageView = binding.ivAlbum
        val tvAlbum : TextView = binding.tvAlbumName
        val tvArtist : TextView = binding.tvArtistName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): trendingViewHolder {
        val binding = ItemMusicalbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return trendingViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return trendingList.size
    }

    override fun onBindViewHolder(holder: trendingViewHolder, position: Int) {
        val trending = trendingList[position]
        holder.ivAlbum.setImageResource(trending.image)
        holder.tvAlbum.text = trending.albumName
        holder.tvArtist.text = trending.artistName
    }
}