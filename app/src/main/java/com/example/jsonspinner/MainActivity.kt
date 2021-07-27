package com.example.jsonspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowId
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var option: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //List 1
        option = findViewById(R.id.actionbarspinner) as Spinner
        result = findViewById(R.id.text) as TextView

        val options = arrayOf("Apartment","Condo","Boat House","Land")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        //List 2
        option = findViewById(R.id.actionbarspinner2) as Spinner
        result = findViewById(R.id.text) as TextView

        val options2 = arrayOf("1 to 3 Rooms","No Rooms")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options2)

        //List 3
        option = findViewById(R.id.actionbarspinner3) as Spinner
        result = findViewById(R.id.text) as TextView

        val options3 = arrayOf("Swimming Pool","Garden Area","Garage")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options3)

    }
}