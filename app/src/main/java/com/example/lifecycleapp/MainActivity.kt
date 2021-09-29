package com.example.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity","Welcome")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","How are you ?!")

    }
    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "You look great today")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "Do your best")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "Do what makes you happy")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "Sweet dreams")
    }
}