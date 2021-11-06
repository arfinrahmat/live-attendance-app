package com.arfinrahmat.liveattendanceapp.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arfinrahmat.liveattendanceapp.R
import com.arfinrahmat.liveattendanceapp.databinding.ActivityLoginBinding
import com.arfinrahmat.liveattendanceapp.views.forgotpass.ForgotPasswordActivity
import com.arfinrahmat.liveattendanceapp.views.main.MainActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            startActivity<MainActivity>()
        }

        binding.btnForgotPassword.setOnClickListener {
            startActivity<ForgotPasswordActivity>()
        }
    }
}