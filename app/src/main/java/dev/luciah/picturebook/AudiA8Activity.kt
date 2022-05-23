package dev.luciah.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AudiA8Activity : AppCompatActivity() {
    lateinit var btnback2:Button
    lateinit var btna8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audi_a8)
        btnback2 = findViewById(R.id.btnback2)
        btna8 =findViewById(R.id.btna8)
        btna8.setOnClickListener {
            var intent = Intent(this,AudiA7Activity::class.java)
            startActivity(intent)
        }
        btnback2.setOnClickListener {
            var intent = Intent(this,AudiQ5Activity::class.java)
            startActivity(intent)
        }

    }
}