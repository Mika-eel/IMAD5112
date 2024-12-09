package com.example.imad5112

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreenActivity : AppCompatActivity() {

    fun main() {
        // Array to store the days of in a week
        val daysOfWeek = arrayOf(
            "2024-10-07",
            "2024-10-08",
            "2024-10-09",
            "2024-10-10",
            "2024-10-11",
            "2024-10-12",
            "2024-10-13"
        )

        // Array to store the amount of money spent each morning and afternoon
        val moneySpent = arrayOf("60-100", "12-200", "##", "##", "##", "##", "##")

        // Displaying the money spent for each day
        for (i indaysOfWeek.indices) {
            println("${daysOfWeek[i]}: $${moneySpent[i]}")
        }

        // Calculate the total money spent during the week
        valtotalSpent = moneySpent.sum()
        println("Total money spent this week: $$totalSpent")



        // Find the day with the maximum spending
        val maxSpentIndex = moneySpent.indices.maxByOrNull { moneySpent[it] }
        if(maxSpentIndex != null)
        { println("Day with the highest spending: ${daysOfWeek[maxSpentIndex]} ($${moneySpent[maxSpentIndex]})") } }

    val detailedbutton : Button = findViewById<>(R.id.detailedbutton)
    val editTextNumberSigned : PlainText = findViewById<>(R.id.editTextNumberSigned)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            }
         setOnClickListener {
            val detailedbutton intent = Intent(this DetailedScreenActivity. ::class.java)
            mainscreenbutton intent
                    finish()
        }
    }
}