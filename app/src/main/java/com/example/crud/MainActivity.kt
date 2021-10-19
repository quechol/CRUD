package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import java.io.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAcpt:Button = findViewById(R.id.btnLogin)
        val edUser:EditText = findViewById(R.id.editUser)
        val edPswd:EditText = findViewById(R.id.editPaswd)

        var errores:Int = 0


        btnAcpt.setOnClickListener{
            val enviar = Intent(this, Menu::class.java)
            startActivity(enviar)
        }
    }
}