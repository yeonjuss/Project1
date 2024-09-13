package com.syj2024.project.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syj2024.project.SignUpActivity2
import com.syj2024.project.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))

        }

    }
}