package com.shinto_pa.helpinternaccomodationprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val SignuptoHom: ImageButton = findViewById(R.id.imgSignUpAc)
        SignuptoHom.setOnClickListener {
            val intent = Intent(applicationContext, HomeScreenActivity::class.java)
            startActivity(intent)
        }
    }
}