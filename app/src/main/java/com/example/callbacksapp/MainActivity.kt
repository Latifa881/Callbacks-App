package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


//The Activity Lifecycle callbacks (onCreate, onStart, onResume, onPause, onStop, onDestroy).
class MainActivity : AppCompatActivity() {
    lateinit var btStart2ndActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btStart2ndActivity = findViewById(R.id.btStart2ndActivity)
        Toast.makeText(this,"onCreate Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onCreate Activity1")
        btStart2ndActivity.setOnClickListener {

            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)

        }


        }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStart Activity1")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onResume Activity1")

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onPause Activity1")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStop Activity1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity1",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onDestroy Activity1")
    }
    }



