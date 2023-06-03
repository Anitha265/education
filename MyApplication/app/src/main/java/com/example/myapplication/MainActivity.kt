package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatToggleButton
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CategoryListAdapter
import com.example.myapplication.adapter.SubjectListAdapter
import com.example.myapplication.model.Category
import com.example.myapplication.model.Subject
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var subAdapter: SubjectListAdapter
    lateinit var recycler_view : RecyclerView
    lateinit var btn_click : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view = findViewById(R.id.recycler_view)
        btn_click = findViewById(R.id.btn_click)

        var subjectsList: ArrayList<Subject> = ArrayList()
        var subject1 =
            Subject("Mathematics", "4 minutes ago", "https://cdn.vectorstock.com/i/1000x1000/87/50/man-male-young-person-icon-vector-10458750.webp", "Two block of mass m1=7 kg", "5 poin")
        var subject2 =
            Subject("History", "20 minutes ago", "https://cdn.vectorstock.com/i/1000x1000/87/50/man-male-young-person-icon-vector-10458750.webp", "Who first president of india", "9 poin")
        var subject3 =
            Subject("English", "5 minutes ago", "https://cdn.vectorstock.com/i/1000x1000/87/50/man-male-young-person-icon-vector-10458750.webp", "testing the description of English", "6 poin")
        var subject4 =
            Subject("Science", "4 minutes ago", "https://cdn.vectorstock.com/i/1000x1000/87/50/man-male-young-person-icon-vector-10458750.webp", "testing the description of Science", "5 poin")
        var subject5 =
            Subject("Social", "3 minutes ago", "https://cdn.vectorstock.com/i/1000x1000/87/50/man-male-young-person-icon-vector-10458750.webp", "testing the description of Social", "7 poin")

        subjectsList.add(subject1)
        subjectsList.add(subject2)
        subjectsList.add(subject3)
        subjectsList.add(subject4)
        subjectsList.add(subject5)


        var layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        subAdapter = SubjectListAdapter(this, subjectsList)
        recycler_view.adapter = subAdapter
        recycler_view.layoutManager = layoutManager

        btn_click.setOnClickListener() {
            Toast.makeText(this@MainActivity, "You clicked on ImageView.", Toast.LENGTH_SHORT).show()
           intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)

//            val dialog = BottomSheetDialog(this)
//
//            val view = layoutInflater.inflate(R.layout.catname, null)
//
//            val btnClose = view.findViewById<TextView>(R.id.confirm)
//
//            btnClose.setOnClickListener {
//
//                dialog.dismiss()
//            }
//
//            dialog.setCancelable(false)
//
//            dialog.setContentView(view)
//
//            dialog.show()
        }

    }
}