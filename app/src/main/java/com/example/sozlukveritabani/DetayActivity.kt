package com.example.sozlukveritabani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val turkceText:TextView = findViewById(R.id.turkceText2)
        val ingilizceText:TextView = findViewById(R.id.ingilizceText2)

        val kelime = intent.getSerializableExtra("nesne") as Kelimeler

        ingilizceText.text = kelime.ingilizce
        turkceText.text = kelime.turkce
    }
}