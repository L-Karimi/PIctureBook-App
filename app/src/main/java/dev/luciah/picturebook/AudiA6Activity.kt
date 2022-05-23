package dev.luciah.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AudiA6Activity : AppCompatActivity() {
    lateinit var btnback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audi_a6)
        btnback = findViewById(R.id.btnback)
        btnback.setOnClickListener {
            var intent = Intent(this,AudiA7Activity::class.java)
            startActivity(intent)
        }
        finish()
    }
}