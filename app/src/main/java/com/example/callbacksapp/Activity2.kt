package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    lateinit var btStart3dActivity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        btStart3dActivity=findViewById(R.id.btStart3dActivity)
        Toast.makeText(this,"onCreate Activity2", Toast.LENGTH_SHORT).show()
        Log.d("TAG","onCreate Activity2")
        btStart3dActivity.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart Activity2",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStart Activity2")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity2",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onResume Activity2")

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity2",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onPause Activity2")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop Activity2",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onStop Activity2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity2",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onDestroy Activity2")
    }
}