package com.example.task3a

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homeview)

        val textView = findViewById<TextView>(R.id.myTextView)
        textView.requestFocus()
    }
}