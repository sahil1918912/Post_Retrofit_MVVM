package com.example.post_mvvm_retrofit.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.post_mvvm_retrofit.R
import com.example.post_mvvm_retrofit.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var rvMain : RecyclerView
    private lateinit var myAdapter: MyAdapter
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvMain = findViewById(R.id.recyclerView)
        rvMain.layoutManager = LinearLayoutManager(this)


        mainViewModel.students.observe(this, Observer { students ->
            myAdapter = MyAdapter(this,students)
            rvMain.adapter = myAdapter
        })

        mainViewModel.fetchStudents()
    }
}