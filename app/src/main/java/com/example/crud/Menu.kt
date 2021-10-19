package com.example.crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Menu : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val rgCRUD:RadioGroup = findViewById(R.id.radioCRUD)

        val rbC:RadioButton = findViewById(R.id.rbtnCreate)
        val rbR:RadioButton = findViewById(R.id.rbtnRead)
        val rbU:RadioButton = findViewById(R.id.rbtnUpdate)
        val rbD:RadioButton = findViewById(R.id.rbtnDelete)

        val btnAceptar:Button = findViewById(R.id.buttonSel)

        btnAceptar.setOnClickListener {
            val opc: Int = rgCRUD.checkedRadioButtonId
            var i: Int = 0
            if(opc == -1){
                //no seleccion
            }else{
                when(opc){
                    rbC.id -> {
                        i=0
                    }
                    rbR.id -> {
                        i=1
                    }
                    rbU.id -> {
                        i=2
                    }
                    rbD.id -> {
                        i=3
                    }
                }
            }
        }
    }
}