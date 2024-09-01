package com.example.post_mvvm_retrofit.model

import com.google.gson.annotations.SerializedName


data class Student(

    @field:SerializedName("Status")
    val status: String? = null,

    @field:SerializedName("InstructorStudentList")
    val instructorStudentList: List<InstructorStudentListItem?>? = null,

    @field:SerializedName("StatusMessage")
    val statusMessage: String? = null
)

data class InstructorStudentListItem(

    @field:SerializedName("GPrice")
    val gPrice: String? = null,

    @field:SerializedName("DueAmount")
    val dueAmount: String? = null,

    @field:SerializedName("Addons")
    val addons: String? = null,

    @field:SerializedName("CourseCode")
    val courseCode: String? = null,

    @field:SerializedName("IsEvaluationeligible")
    val isEvaluationeligible: String? = null,

    @field:SerializedName("StudentType")
    val studentType: String? = null,

    @field:SerializedName("StudentPaymentType")
    val studentPaymentType: String? = null,

    @field:SerializedName("TotalExtraLessonCount")
    val totalExtraLessonCount: String? = null,

    @field:SerializedName("StudentPaymentStatus")
    val studentPaymentStatus: String? = null,

    @field:SerializedName("PaidP1Amount")
    val paidP1Amount: String? = null,

    @field:SerializedName("RoadTestaddonId")
    val roadTestaddonId: String? = null,

    @field:SerializedName("DrivingScore")
    val drivingScore: String? = null,

    @field:SerializedName("AdvanceAvailable")
    val advanceAvailable: String? = null,

    @field:SerializedName("Phone")
    val phone: String? = null,

    @field:SerializedName("DocumentDownloadLink")
    val documentDownloadLink: String? = null,

    @field:SerializedName("InstructorShare")
    val instructorShare: String? = null,

    @field:SerializedName("TotalPurchasedExtraLesson")
    val totalPurchasedExtraLesson: String? = null,

    @field:SerializedName("StudentAddress")
    val studentAddress: String? = null,

    @field:SerializedName("PaymentStatus")
    val paymentStatus: String? = null,

    @field:SerializedName("StudentDue")
    val studentDue: String? = null,

    @field:SerializedName("Is10LessonCompleted")
    val is10LessonCompleted: String? = null,

    @field:SerializedName("ExtraLessonType")
    val extraLessonType: String? = null,

    @field:SerializedName("Paidp3Amount")
    val paidp3Amount: String? = null,

    @field:SerializedName("BalanceAmount")
    val balanceAmount: String? = null,

    @field:SerializedName("RegistrationId")
    val registrationId: String? = null,

    @field:SerializedName("LessonId")
    val lessonId: String? = null,

    @field:SerializedName("IsRoadTestPurchased")
    val isRoadTestPurchased: String? = null,

    @field:SerializedName("ProgramName")
    val programName: String? = null,

    @field:SerializedName("Score")
    val score: String? = null,

    @field:SerializedName("TotalLessonCount")
    val totalLessonCount: String? = null,

    @field:SerializedName("G2Price")
    val g2Price: String? = null,

    @field:SerializedName("TotalPrice")
    val totalPrice: String? = null,

    @field:SerializedName("Id")
    val id: String? = null,

    @field:SerializedName("PaidP2Amount")
    val paidP2Amount: String? = null,

    @field:SerializedName("StudentName")
    val studentName: String? = null,

    @field:SerializedName("IsEvaluationCompleted")
    val isEvaluationCompleted: String? = null
)