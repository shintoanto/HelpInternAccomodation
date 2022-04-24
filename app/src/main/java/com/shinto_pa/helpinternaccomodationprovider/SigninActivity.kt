package com.shinto_pa.helpinternaccomodationprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val SignIntoHom: ImageButton = findViewById(R.id.imgSignInToA)
        SignIntoHom.setOnClickListener {
            val intent = Intent(applicationContext, HomeScreenActivity::class.java)
            startActivity(intent)
        }
    }
}