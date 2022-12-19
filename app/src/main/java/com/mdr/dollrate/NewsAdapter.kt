package com.mdr.dollrate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    private val items = ArrayList<News>()

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val  titleView: TextView = itemView.findViewById(R.id.title)
        val  author: TextView = itemView.findViewById(R.id.author)
        val  image: TextView = itemView.findViewById(R.id.image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent, false)
        val viewHolder = NewsViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentNews = items[position]
        holder.titleView.text = currentNews.title
        holder.author.text = currentNews.author
    }

    override fun getItemCount(): Int {
        return items.size
    }
}