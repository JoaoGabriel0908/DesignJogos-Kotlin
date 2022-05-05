package com.example.designjogos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var pesquisar = findViewById<ImageView>(R.id.pesquisar)
        pesquisar.setOnClickListener {
            var intent = Intent (this, activity_games::class.java)
            startActivity(intent)
        }
    }
}