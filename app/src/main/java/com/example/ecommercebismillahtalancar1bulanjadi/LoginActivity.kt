package com.example.ecommercebismillahtalancar1bulanjadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        intentButtonDaftar()
    }
    private fun intentButtonDaftar() {
        btn_daftar.setOnClickListener(){
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}