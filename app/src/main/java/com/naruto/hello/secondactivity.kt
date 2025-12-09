package com.naruto.hello

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        
        val messageText: TextView = findViewById(R.id.messageText)
        val backButton: Button = findViewById(R.id.backButton)
        
        val clicks = intent.getIntExtra("CLICKS", 0)
        
        val message = when {
            clicks == 0 -> "Tu n'as pas cliqué du tout... 😢"
            clicks < 5 -> "Seulement $clicks clics ? Tu peux faire mieux !"
            clicks < 10 -> "$clicks clics ! Pas mal ninja !"
            else -> "WOW $clicks clics ! Tu es un vrai Hokage ! 🍥"
        }
        
        messageText.text = message
        
        backButton.setOnClickListener {
            finish()
        }
    }
}
