package com.example.intentservicetr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val btnFirst=findViewById<Button>(R.id.btnStart)
        val btnSecond=findViewById<Button>(R.id.btnStop)
        val tvFirst=findViewById<TextView>(R.id.tvServiceStopped)

        btnFirst.setOnClickListener {
            Intent(this,MyIntentService::class.java).also {
                startService(it)
                tvFirst.text = "Service running"
            }
        }
        btnSecond.setOnClickListener {
            MyIntentService.stopService()
            tvFirst.text = "Service Stopped"
        }
    }
}