package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import java.io.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAcpt:Button = findViewById(R.id.btnLogin)
        val edUser:EditText = findViewById(R.id.editUser)
        val edPswd:EditText = findViewById(R.id.editPaswd)

        var errores:Int = 0

        var usuarios:String = ""

        usuarios = readFile()

        btnAcpt.setOnClickListener{
            if (usuarios.length==0){

            }else {
                val enviar = Intent(this, Menu::class.java)
                startActivity(enviar)
            }
        }
    }
}

fun readFile (): String {
    var cadena:String = ""
    try{
        var fin=FileReader("db.txt")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())
            cadena = cadena +","+ c.toString()
        }while (c!=-1)
    }catch (ex:Exception){
    }
    return cadena
}