package com.example.crud

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent




class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        var numberList: ArrayList<Animal> = intent .getSerializableExtra( "Datos" ) as ArrayList<Animal>
        //textView . text = numberList .toString()
        numberList.get(0)
    }
}