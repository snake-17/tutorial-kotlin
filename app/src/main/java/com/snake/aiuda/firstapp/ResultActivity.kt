package com.snake.aiuda.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.snake.aiuda.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val nombre: String = intent.extras?.getString("extranombre").orEmpty()

        tvResultado.text = "Hola $nombre"
    }
}