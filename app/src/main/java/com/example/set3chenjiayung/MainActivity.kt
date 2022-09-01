package com.example.set3chenjiayung

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.set3chenjiayung.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitbutton.setOnClickListener {
            val studentNo = binding.editTextStudentNo.text.toString()
            val institute = binding.instituteSpinner.toString()
            val cgpa = binding.editTextCGPA.text.toString()

            var evaluation: String? = null
            var classHon: String? = null

            when (cgpa.toFloat()) {
                in 3.5000..4.0000 -> {
                    evaluation = "You're eligible for \nthe scholarship!"
                    classHon = "First Class"
                }
                in 3.0000..3.4999 -> {
                    evaluation = "You're eligible for \nthe scholarship!"
                    classHon = "Second Class (Upper Division)"
                }
                in 2.2000..2.9999 -> {
                    evaluation = "You're eligible for \nthe scholarship!"
                    classHon = "Second Class (Lower Division)"
                }
                in 2.0000..2.1999 -> {
                    evaluation = "You're eligible for \nthe scholarship!"
                    classHon = "Third Class"
                }
                in 0.0000..1.9999->{
                    evaluation = "Unfortunately you're \nnot eligible for the \nscholarship."
                }
                else ->{
                    evaluation = "Error, please check \nCGPA input."
                }
            }



            binding.textView5.text = "Student $studentNo,"
            binding.classnote.text = "your class of honour is \n$classHon."
            binding.evaluationTxt.text = "Hence, $evaluation"



        }

    }
}