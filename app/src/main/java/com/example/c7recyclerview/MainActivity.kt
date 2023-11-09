package com.example.c7recyclerview

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val itemList = mutableListOf<YourItemModel>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: YourRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = YourRecyclerAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val addButton: Button = findViewById(R.id.addButton)
        addButton.setOnClickListener {

            val editTextText1: EditText = findViewById(R.id.editTextText1)
            val editTextText2: EditText = findViewById(R.id.editTextText2)
            var name: Editable? = editTextText1.text
            var description: Editable? = editTextText2.text


            addItem(name, description)
        }
    }

    private fun addItem(name: Editable?, description: Editable?) {
        val newItem = YourItemModel(name, description )
        itemList.add(newItem)
        adapter.notifyItemInserted(itemList.size - 1)
    }
}
