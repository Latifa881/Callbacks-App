package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Toast.makeText(this,"onCreate Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onCreate Activity3")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStart Activity3")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onResume Activity3")

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onPause Activity3")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStop Activity3")

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity3", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onDestroy Activity3")
    }
}