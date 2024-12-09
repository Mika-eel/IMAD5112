package com.example.imad5112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val imageView : Image = findViewById<>(R.id.imageView)
        val mainscreenbutton : Button = findViewById<>(R.id.mainscreenbutton)
        val exitbutton : Button = findViewById<>(R.id.exitbutton)

        mainscreenbutton setOnClickListener {
            val intent = Intent(this MainScreenActivity. ::class.java)
            mainscreenbutton intent
                    finish()
        }
        exitbutton setOnClickListener {
            finish()
        }
    }
}