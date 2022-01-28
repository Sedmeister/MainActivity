package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workExperience= findViewById<Button>(R.id.workExperience)
        workExperience.setOnClickListener{
           val goToWorkExperienceActivity = Intent(getApplicationContext(), WorkExperienceActivity::class.java)
            startActivity(goToWorkExperienceActivity)
        }

        val education= findViewById<Button>(R.id.education)
        education.setOnClickListener{
             val goToEducation = Intent(getApplicationContext(), EducationActivity::class.java)
            startActivity(goToEducation)
        }

        val emailLesedi= findViewById<Button>(R.id.emailLesedi)
        emailLesedi.setOnClickListener{
            val intentEmailLesedi = Intent(Intent.ACTION_SEND)
            intentEmailLesedi.setType("plain/text")
            intentEmailLesedi.putExtra(Intent.EXTRA_EMAIL,"sedikgosi@gmail.com")
            intentEmailLesedi.putExtra(Intent.EXTRA_SUBJECT,"Hi Lesedi, We read your CV!")
            startActivity(intentEmailLesedi)
        }

    }
}