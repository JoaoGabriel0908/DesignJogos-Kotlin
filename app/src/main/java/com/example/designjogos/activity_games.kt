package com.example.designjogos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class activity_games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)

        var detalhe = findViewById<LinearLayout>(R.id.god1)
        detalhe.setOnClickListener {
            var intent = Intent (this, Details_games::class.java)
            startActivity(intent)
        }
    }
}