package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Some title"
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun sub(x: Int, y: Int): Int {
        return x - y
    }
}
