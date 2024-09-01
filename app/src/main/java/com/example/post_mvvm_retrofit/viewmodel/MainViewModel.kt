package com.example.post_mvvm_retrofit.viewmodel

import android.app.Application
import android.util.Log

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.post_mvvm_retrofit.model.InstructorStudentListItem
import com.example.post_mvvm_retrofit.repository.UserRepository
import com.google.gson.Gson
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val repository = UserRepository()

    private val _students = MutableLiveData<List<InstructorStudentListItem>>()
    val students : LiveData<List<InstructorStudentListItem>> get() = _students

    fun fetchStudents() {
        viewModelScope.launch {
            Log.d("TAG", "fetchStudents: Success")

            try {
                val student = repository.getStudents()
                _students.postValue(student.instructorStudentList as List<InstructorStudentListItem>?)
                val str = Gson().toJson(student)
                Log.i("TAG", "getStudentData:${student.statusMessage.toString()}")
                Log.i("TAG", "getStudentData: ${str.toString()}")
            } catch (e : Exception){
                Log.i("TAG", "getStudentData: failed ${e.toString()}")
            }

        }
    }


}