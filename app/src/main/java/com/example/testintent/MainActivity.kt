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

        // Déclaration du bouton pour utilisation
        val btn = findViewById<Button>(R.id.button)
        // Déclaration d'un INTENT pour charger la nouvelle Activity
        val intent = Intent(this,MainActivity2::class.java)
        // Spécifier action à lancer (MainActivity2) pour charger d'MainActivity2

        // setOnClickListener utilise une LAMBDA pour réduire la verbosité du code
        btn.setOnClickListener {
            Toast.makeText(this, "essai", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}