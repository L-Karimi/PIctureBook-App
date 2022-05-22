package dev.luciah.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnhome :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnhome = findViewById(R.id.btnhome)
        btnhome.setOnClickListener {
            var intent = Intent(this, AudiQ5Activity::class.java)
            startActivity(intent)
        }
    }
}