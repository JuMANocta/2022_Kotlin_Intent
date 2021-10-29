package com.example.testintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.button);
        val intent = Intent(this,MainActivity2::class.java)
        but.setOnClickListener {
            Toast.makeText(this, "essai", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}