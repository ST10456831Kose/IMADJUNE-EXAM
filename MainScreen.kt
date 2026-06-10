package com.example.campsitcommander

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainScreen : AppCompatActivity() {
    // Total Items Packed for the campsite trip
    val totalItemsPacked = 7
    val items = mutableListOf<String>("Camping Tent",
        "4x Sleeping Bag", "18x Water", "Flash Lights", "Backup generator","Toothbrush", "Food and snacks" +
                " First Aid Bag")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        //show the string on the PcktList TextView
//        val textView = findViewById<TextView>(/* id = */ R.id.PcktList)
//        textView.text = items.toString()

        //set the text view to the total items packed
        val totalItemsPackedTextView = findViewById<TextView>(R.id.PcktList)
//        totalItemsPackedTextView.text = "Total Items Packed: $totalItemsPacked"

        //add all items to display string builder
        var displayString = StringBuilder()
        for (item in items) {
            displayString.append(item).append("\n")
        }
    }

}

