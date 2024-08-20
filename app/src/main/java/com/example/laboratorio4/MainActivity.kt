package com.example.laboratorio4

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textoNombre: EditText
    lateinit var textoURL : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textoNombre = findViewById(R.id.textoNombre)
        textoURL = findViewById(R.id.textoURL)

    }
    fun agregarreceta(view: View){
//        textoNombre.text
//        textoURL.text
        println("hola: "+textoNombre.text)
        println("URL: "+textoURL.text)
    }
}