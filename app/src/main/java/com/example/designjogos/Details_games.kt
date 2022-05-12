package com.example.designjogos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.util.*
import kotlin.concurrent.schedule

class Details_games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_games)

        var voltar = findViewById<ImageView>(R.id.voltar)
        voltar.setOnClickListener {
            var intent = Intent(this, activity_games::class.java)
            startActivity(intent)
        }
        var perfil = findViewById<ImageView>(R.id.perfil)
        perfil.setOnClickListener {
            var intent = Intent(this, PrincipalActivity::class.java)
            startActivity(intent)
        }
    }
}