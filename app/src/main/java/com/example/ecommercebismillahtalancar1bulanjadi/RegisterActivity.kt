package com.example.ecommercebismillahtalancar1bulanjadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        intentButtonMasuk()
    }
    private fun intentButtonMasuk () {
        btn_masuk.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}