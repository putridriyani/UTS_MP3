package com.cc.utslabmp3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile3_uts.R

class ExerciseAdapter(private val popularList: List<Popular>) :
    RecyclerView.Adapter<ExerciseAdapter.PopularListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exercise_list, parent, false)
        return PopularListViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularListViewHolder, position: Int) {
        val popular = popularList[position]
        holder.imageView.setImageResource(popular.imageResource)
        holder.titleTextView.text = popular.text
        holder.categoryTextView.text = popular.category
        holder.timeTextView.text = popular.time
    }

    override fun getItemCount(): Int = popularList.size

    class PopularListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val categoryTextView: TextView = itemView.findViewById(R.id.categoryTextView)
        val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
    }
}
