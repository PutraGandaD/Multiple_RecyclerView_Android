package com.putragandad.multiplerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.multiplerv.Adapter.PromotionAdapter
import com.putragandad.multiplerv.Adapter.RevisitAdapter
import com.putragandad.multiplerv.Adapter.TrendingAdapter
import com.putragandad.multiplerv.Model.Promotion
import com.putragandad.multiplerv.Model.Revisit
import com.putragandad.multiplerv.Model.Trending

class MainActivity : AppCompatActivity() {

    private lateinit var promotionRecyclerView: RecyclerView
    private lateinit var trendingRecyclerView: RecyclerView
    private lateinit var revisitRecyclerView: RecyclerView

    private lateinit var promotionList : ArrayList<Promotion>
    private lateinit var trendingList : ArrayList<Trending>
    private lateinit var revisitList : ArrayList<Revisit>

    private lateinit var promotionAdapter: PromotionAdapter
    private lateinit var trendingAdapter: TrendingAdapter
    private lateinit var revisitAdapter: RevisitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Promotion Recycler View
        promotionRecyclerView = findViewById(R.id.rv_promotion)
        promotionRecyclerView.setHasFixedSize(true)
        promotionRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        promotionList = ArrayList()

        promotionList.add(Promotion(R.drawable.img_promote1))
        promotionList.add(Promotion(R.drawable.img_promote2))
        promotionList.add(Promotion(R.drawable.img_promote3))

        promotionAdapter = PromotionAdapter(promotionList)
        promotionRecyclerView.adapter = promotionAdapter

        // Trending Recycler View
        trendingRecyclerView = findViewById(R.id.rv_trending_album)
        trendingRecyclerView.setHasFixedSize(true)
        trendingRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        trendingList = ArrayList()

        trendingList.add(Trending(R.drawable.img_album01, "1989 (Taylor's Version)", "Taylor Swift"))
        trendingList.add(Trending(R.drawable.img_album02, "Melodrama", "Lorde"))
        trendingList.add(Trending(R.drawable.img_album03, "Harry's House", "Harry Styles"))
        trendingList.add(Trending(R.drawable.img_album04, "Divide", "Ed Sheeran"))

        trendingAdapter = TrendingAdapter(trendingList)
        trendingRecyclerView.adapter = trendingAdapter

        // Revisit Recycler View
        revisitRecyclerView = findViewById(R.id.rv_revisit)
        revisitRecyclerView.setHasFixedSize(true)
        revisitRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        revisitList = ArrayList()
        revisitList.add(Revisit(R.drawable.img_revisit01))
        revisitList.add(Revisit(R.drawable.img_revisit02))
        revisitList.add(Revisit(R.drawable.img_revisit03))

        revisitAdapter = RevisitAdapter(revisitList)
        revisitRecyclerView.adapter = revisitAdapter



    }
}