package com.example.testekotlin.view.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.testekotlin.R
import com.example.testekotlin.model.Login
import com.example.testekotlin.view.account.AccountActivity
import com.example.testekotlin.view.register.RegisterActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to all views

//        var viewModel: MainActivityViewModel = MainActivityViewModel()

        var etId = findViewById<EditText>(R.id.etId)
        var etPassword = findViewById<EditText>(R.id.etPassword)
        var btnOk = findViewById<Button>(R.id.btnOk)
        var tvRegister = findViewById< TextView>(R.id.tvRegister)

        //set onclick listener
        btnOk.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        tvRegister.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}