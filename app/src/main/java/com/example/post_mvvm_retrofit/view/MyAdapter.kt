package com.example.post_mvvm_retrofit.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.post_mvvm_retrofit.R
import com.example.post_mvvm_retrofit.model.InstructorStudentListItem


class MyAdapter(private val context: Context, private val list: List<InstructorStudentListItem>) : RecyclerView.Adapter<MyAdapter.ViewHolder> () {

    inner class ViewHolder(v : View) : RecyclerView.ViewHolder(v) {

        var id = v.findViewById<TextView>(R.id.tvId)
        var studentName = v.findViewById<TextView>(R.id.tvStudentName)
        var programName = v.findViewById<TextView>(R.id.tvProgramName)
        var courseCode = v.findViewById<TextView>(R.id.tvCourseCode)
        var studentType = v.findViewById<TextView>(R.id.tvStudentType)
        var dueAmount = v.findViewById<TextView>(R.id.tvDueAmount)
        var score = v.findViewById<TextView>(R.id.tvScore)
        var totalPrice = v.findViewById<TextView>(R.id.tvTotalPrice)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.count()


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listPosition = list[position]
        holder.id.text = listPosition.id
        holder.studentName.text = listPosition.studentName
        holder.programName.text = listPosition.programName
        holder.courseCode.text = listPosition.courseCode
        holder.studentType.text = listPosition.studentType
        holder.dueAmount.text = "$ "+listPosition.dueAmount
        holder.totalPrice.text = "$ "+listPosition.totalPrice
        holder.score.text = listPosition.score

    }
}