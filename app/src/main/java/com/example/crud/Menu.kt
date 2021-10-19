package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.os.Parcelable

class Menu : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        //objetos de vista
        val rgCRUD:RadioGroup = findViewById(R.id.radioCRUD)
        val rbC:RadioButton = findViewById(R.id.rbtnCreate)
        val rbR:RadioButton = findViewById(R.id.rbtnRead)
        val rbU:RadioButton = findViewById(R.id.rbtnUpdate)
        val rbD:RadioButton = findViewById(R.id.rbtnDelete)
        val btnAceptar:Button = findViewById(R.id.buttonSel)
        //val auxTxt:TextView = findViewById(R.id.textViewInfo)
        //variables
        //var zoo: MutableList<Animal> = mutableListOf()
        var zoo: ArrayList<Animal> = ArrayList()
        var numbers: ArrayList<String> = ArrayList()
        var hola: String = "Hola"
        //animales
        val aguila = Animal("EJEMPLO \n", "Habitad: \n", "Dieta: \n", "Promedio de vida: \n")
        //agregar a la lista
        zoo.add(aguila)
        numbers.add("UNO")
        //programa
        btnAceptar.setOnClickListener {
            val opc: Int = rgCRUD.checkedRadioButtonId
            var i: Int = 0
            if(opc == -1){
                //no seleccion
            }else{
                when(opc){
                    rbC.id -> {
                        i=0
                        val crear = Intent(this, Create::class.java)
                        crear.putExtra("Datos", numbers)
                        //intent.putParcelableArrayListExtra("Datos", ArrayList(zoo))
                        startActivity(crear)
                    }
                    rbR.id -> {
                        i=1
                        val leer = Intent(this, Read::class.java)
                        startActivity(leer)
                    }
                    rbU.id -> {
                        i=2
                        val actualizar = Intent(this, Update::class.java)
                        startActivity(actualizar)
                    }
                    rbD.id -> {
                        i=3
                        val eliminar = Intent(this, Delete::class.java)
                        startActivity(eliminar)
                    }
                }
            }
        }
        //auxTxt.text = zoo.toString()
    }
}