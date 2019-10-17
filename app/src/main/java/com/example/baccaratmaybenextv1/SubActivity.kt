package com.example.baccaratmaybenextv1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        btn2.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}