package com.example.jonathan.hellokotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG = "HelloKotlin: MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")

        super.onStart()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart")

        super.onRestart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")

        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")

        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")

        super.onDestroy()
    }
}