package dev.luciah.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AudiQ5Activity : AppCompatActivity() {
    lateinit var btnq5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audi_q5)
        btnq5 = findViewById(R.id.btnq5)
        btnq5.setOnClickListener {
            var intent = Intent(this,AudiA8Activity::class.java)
            startActivity(intent)
        }

    }
}