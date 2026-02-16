package com.example.inf04mobilka

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var wlaczony = false;
        val numer_prania_text = findViewById<TextView>(R.id.numer_prania_text)
        val zatwierdz_button = findViewById<Button>(R.id.zatwierdz)
        val wlacz_button = findViewById<Button>(R.id.wlacz)


        zatwierdz_button.setOnClickListener {
            val numer_prania = findViewById<TextInputEditText>(R.id.numer_prania).text.toString()
            numer_prania_text.text = "Numer prania: $numer_prania"
        }

        wlacz_button.setOnClickListener {
            var wlacz_text_text = findViewById<TextView>(R.id.wlacz_text)
            wlaczony = !wlaczony
            if(wlaczony){
                wlacz_text_text.text = "Odkurzacz Włączony"
                wlacz_button.text = "Wyłącz"
            }
            else{
                if(!wlaczony){
                    wlacz_text_text.text = "Odkurzacz Wyłączony"
                    wlacz_button.text = "Włącz"
                }
            }
        }
}
}