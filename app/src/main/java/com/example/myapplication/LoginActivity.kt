package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        loginButton.setOnClickListener {
            if (username.text.toString() == "Alex" && password.text.toString() == "1234"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Connection réussie!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Connection échouée!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}