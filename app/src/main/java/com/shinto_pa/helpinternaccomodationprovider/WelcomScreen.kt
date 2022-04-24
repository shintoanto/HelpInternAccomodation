package com.shinto_pa.helpinternaccomodationprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom_screen)
        val singin: Button = findViewById(R.id.btnSignInAccom)
        singin.setOnClickListener {
            val intent = Intent(applicationContext, SigninActivity::class.java)
            startActivity(intent)
        }
        val Signup: Button = findViewById(R.id.btnSignUpAccom)
        Signup.setOnClickListener {
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }

    }
}