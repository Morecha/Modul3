package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_onpause: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_onpause = findViewById(R.id.helloworld_text)
        tv_onpause.text = "Activity is Active"
        findViewById<TextView>(R.id.helloworld_text)
        Log.d("MainActivity", "onCreate: Active")
    }

    override fun onStart() {
        super.onStart()
        findViewById<TextView>(R.id.helloworld_text).setText("Sudah lewat On Start")
        Log.d("MainActivity", "onStart: Active")
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.helloworld_text).setText("Sudah lewat onResume")
        Log.d("MainActivity", "onResuem: Active")
    }

    override fun onPause() {
        super.onPause()
        tv_onpause.text = "Activity telah Melewati onPause()"
        Log.d("MainActivity", "onPause: Active")
    }

    override fun onStop() {
        super.onStop()
        findViewById<TextView>(R.id.helloworld_text).setText("Saya melewati onStop()")
        Log.d("MainActivity", "onStop: Active")
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
        findViewById<TextView>(R.id.helloworld_text).setText("Telah Melewati onDestroy()")
        Log.d("MainActivity", "onDestroy: Active")
    }
}