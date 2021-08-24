package com.py.aviadoresapp.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.py.aviadoresapp.R
import com.py.aviadoresapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.btnIngresar.setOnClickListener{
            Log.i("viole", "estoy")
            Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show()
        }

    }


}