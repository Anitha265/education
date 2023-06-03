package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.Category

class CategoryListAdapter(private val context: Context, val categoryList : ArrayList<Category>) : RecyclerView.Adapter<CategoryListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.catname, parent, false)

        return ViewHolder(view)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textViewSubName = itemView.findViewById(R.id.categoryName) as TextView
        val imageView = itemView.findViewById(R.id.imgView) as ImageView

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eachCategory = categoryList[position]
        holder.textViewSubName.text = eachCategory.categoryName.toString()
        Glide.with(context)
            .load(eachCategory.avatar)
            .into(holder.imageView)

    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}