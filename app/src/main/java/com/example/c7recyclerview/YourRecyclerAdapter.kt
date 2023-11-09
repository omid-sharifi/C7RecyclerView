package com.example.c7recyclerview


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class YourRecyclerAdapter(private val itemList: List<YourItemModel>) : RecyclerView.Adapter<YourItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YourItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.your_list_item_layout, parent, false)
        return YourItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: YourItemViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.textName.text = currentItem.name
        holder.textDescription.text = currentItem.description
    }

    override fun getItemCount() = itemList.size
}
