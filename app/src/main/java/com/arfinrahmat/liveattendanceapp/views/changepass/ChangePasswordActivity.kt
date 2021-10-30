package com.arfinrahmat.liveattendanceapp.views.changepass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arfinrahmat.liveattendanceapp.R
import com.arfinrahmat.liveattendanceapp.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        onclick()
    }

    private fun onclick() {
        binding.tbChangePassword.setNavigationOnClickListener {
            finish()
        }
    }

    private fun init() {
        setSupportActionBar(binding.tbChangePassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}