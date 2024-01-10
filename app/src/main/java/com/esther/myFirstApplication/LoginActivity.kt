package com.esther.myFirstApplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.esther.myapplication.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button:Button =this.findViewById(R.id.CreateNewAccount)

        button.setOnClickListener {
            val intent = Intent( this,CreateAccountActivity::class.java)

            this.startActivity(intent)
        }
    }
    }
