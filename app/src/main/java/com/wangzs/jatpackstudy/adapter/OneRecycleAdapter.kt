package com.wangzs.jatpackstudy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wangzs.jatpackstudy.R

class OneRecycleAdapter(private val list: List<String>) : RecyclerView.Adapter<OneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        val inflate =
            LayoutInflater.from(parent.context).inflate(R.layout.item_one_recycle, parent, false)
        return OneViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        val s = list[position]
        holder.mTitleTv.text = s
    }
}


class OneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var mTitleTv: TextView

    init {
        mTitleTv = itemView.findViewById(R.id.oneItemTitle)
    }
}