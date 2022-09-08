package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message_activity)

        val message: String? = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
    }
}