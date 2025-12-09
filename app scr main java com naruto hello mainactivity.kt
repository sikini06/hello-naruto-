package com.naruto.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    private lateinit var counterText: TextView
    private var clickCount = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        counterText = findViewById(R.id.counterText)
        val clickButton: Button = findViewById(R.id.clickButton)
        val nextButton: Button = findViewById(R.id.nextButton)
        
        clickButton.setOnClickListener {
            clickCount++
            counterText.text = "Clics : $clickCount"
            
            when (clickCount) {
                5 -> counterText.text = "Dattebayo ! ($clickCount)"
                10 -> counterText.text = "Believe it ! ($clickCount)"
                15 -> counterText.text = "Je serai Hokage ! ($clickCount)"
            }
        }
        
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("CLICKS", clickCount)
            startActivity(intent)
        }
    }
}
