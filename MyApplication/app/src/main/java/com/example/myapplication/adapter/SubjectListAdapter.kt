package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.Subject
import java.util.*

class SubjectListAdapter(private val context: Context, val subjectsList : ArrayList<Subject>) : RecyclerView.Adapter<SubjectListAdapter.ViewHolder>() {
//    fun updateCountries(newUsers: ArrayList<User>) {
//        usersList.clear()
//        usersList.addAll(newUsers)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)

        return ViewHolder(view)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textViewSubName = itemView.findViewById(R.id.subjectName) as TextView
        val textViewLastUsed = itemView.findViewById(R.id.lastUsed) as TextView
        val imageView = itemView.findViewById(R.id.imgView) as ImageView
        val textViewDescription = itemView.findViewById(R.id.description) as TextView

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val eachSubject = subjectsList[position]
        holder.textViewSubName.text = eachSubject.subjectName.toString()
        holder.textViewLastUsed.text= eachSubject.lastUsed.toString()
        holder.textViewDescription.text = eachSubject.description.toString()
        Glide.with(context)
            .load(eachSubject.avatar)
            .into(holder.imageView)

    }

    override fun getItemCount(): Int {
        return subjectsList.size
    }
}