package com.snake.aiuda.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.snake.aiuda.R

class PrimeraAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_app)
        val btnpuchame = findViewById<AppCompatButton>(R.id.btnpuchame)
        val etNombre = findViewById<AppCompatEditText>(R.id.etNombre)


        btnpuchame.setOnClickListener {
            val nombre = etNombre.text.toString()
            if (nombre.isNotEmpty()) {

                //quitamos el log
                //Log.i("Atilano","Glow Kitty $nombre")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("extranombre", nombre)
                startActivity(intent)

            }
        }


    }
}