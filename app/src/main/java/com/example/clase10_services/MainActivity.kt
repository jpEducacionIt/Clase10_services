package com.example.clase10_services

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonRun: Button
    private lateinit var buttonStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRun = findViewById(R.id.buttonRun)
        buttonStop = findViewById(R.id.buttonStop)

        buttonRun.setOnClickListener {
           startService(Intent(this@MainActivity, MyService::class.java))
        }

        buttonStop.setOnClickListener {
            stopService(Intent(this@MainActivity, MyService::class.java))
        }
    }
}
