package com.example.odeioandroidstudio

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewMensagem: TextView
    private lateinit var textViewMensagem2: TextView
    private lateinit var btnNova: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textViewMensagem = findViewById(R.id.tvDesc)
        this.textViewMensagem.text = Build.DEVICE.toString()

        this.textViewMensagem2 = findViewById(R.id.tvInfo)

        this.btnNova = findViewById<Button>(R.id.button)
        this.btnNova.setOnClickListener {
            this.textViewMensagem2.text = "The name of the industrial design."
        }
    }
}