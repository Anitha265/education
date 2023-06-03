package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CategoryListAdapter
import com.example.myapplication.model.Category
import java.util.ArrayList

class CategoryActivity : AppCompatActivity() {

    lateinit var catAdapter: CategoryListAdapter
    lateinit var recycler_view : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        recycler_view = findViewById(R.id.recycler_view)

        var categoryList: ArrayList<Category> = ArrayList()
        var category1 = Category("Middleschool", "")
        var category2 = Category("Highschool", "")
        var category3 = Category("College", "")

        categoryList.add(category1)
        categoryList.add(category2)
        categoryList.add(category3)

        var layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        catAdapter = CategoryListAdapter(this, categoryList)
        recycler_view.adapter = catAdapter
        recycler_view.layoutManager = layoutManager

    }
}