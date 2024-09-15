package com.syj2024.project.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syj2024.project.databinding.ActivitySignupBinding

class SignUpActivity : AppCompatActivity() {

    val binding by lazy { ActivitySignupBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnSign.setOnClickListener {
            startActivity(Intent(this, SignUpActivity2::class.java))

        }

    }
}