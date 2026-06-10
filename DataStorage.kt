package com.example.campsitcommander

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale
import java.util.Locale.getDefault


class DataStorage : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_storage)
        val tableLayout = findViewById<TableLayout>(R.id.TableLayout)

        //1. Create a 2D array of items
        val dataMatrix = arrayOf(
            arrayOf(
                "Item Details",
                "Category",
                "Quantity",
                "Comments"
            )

        )
                     arrayOf("Flashlight", "Camping Gear", "8", "check batteries before leaving")
                    arrayOf("Backup Generator", "Camping Gear", "1", "for morning baths")
                     arrayOf("Toothbrush", "Camping Gear", "8", "for brushing teeth")
                    arrayOf("Food and Snacks", "Camping Gear", "8", "for nutrition")
                    arrayOf ("First Aid Bag",
            "Camping Gear",
            "1",
            "for emergencies"
        )

        //2. Loop through the array to construct rows
        for (row in dataMatrix) {
            val tableRow = TableRow(this)

            //3.Loop through the individual cells values in the row
               val textView: TextView = TextView(this).apply {
                setPadding(8, 8, 8, 8)
                gravity = Gravity.CENTER
            }

            //4.Add the finished row into the master table layout
            tableLayout.addView(tableRow)

        }
    }
}