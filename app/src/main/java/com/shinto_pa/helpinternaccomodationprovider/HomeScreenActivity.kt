package com.shinto_pa.helpinternaccomodationprovider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val accomRegCard: CardView = findViewById(R.id.accomRegCard)
        accomRegCard.setOnClickListener {
            val intent = Intent(applicationContext, AccomodationRegistration::class.java)
            startActivity(intent)
        }
        val accomView: CardView = findViewById(R.id.accomodationView)
        accomView.setOnClickListener {
            val intent = Intent(applicationContext, AccomodationView::class.java)
            startActivity(intent)
        }

        val BookedAccom: CardView = findViewById(R.id.bookedAccomcard)
        BookedAccom.setOnClickListener {
            val intent = Intent(applicationContext, BookedAccomodation::class.java)
            startActivity(intent)
        }

        val profAccom: ImageView = findViewById(R.id.imgAccoulntAccom)
        profAccom.setOnClickListener {
            val intent = Intent(applicationContext, ProfilePage::class.java)
            startActivity(intent)
        }
    }
}