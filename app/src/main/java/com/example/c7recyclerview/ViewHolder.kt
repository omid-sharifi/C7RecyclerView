package com.example.c7recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class YourItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textName: TextView = itemView.findViewById(R.id.textName)
    val textDescription: TextView = itemView.findViewById(R.id.textDescription)
}
