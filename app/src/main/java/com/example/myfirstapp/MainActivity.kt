package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("My First App")
    }

    fun onClick(view: View){
        val intent: Intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById(R.id.edit_message) as EditText
        val message: String = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    companion object{
        val EXTRA_MESSAGE = "extra_msg"
    }

}