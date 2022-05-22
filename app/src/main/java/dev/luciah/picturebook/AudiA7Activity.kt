package dev.luciah.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AudiA7Activity : AppCompatActivity() {
    lateinit var btna7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audi_a7)
        btna7 = findViewById(R.id.btna7)
        btna7.setOnClickListener {
            var intent = Intent(this,AudiA6Activity::class.java)
            startActivity(intent)
        }

    }
}