package com.arfinrahmat.liveattendanceapp.views.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.arfinrahmat.liveattendanceapp.R
import com.arfinrahmat.liveattendanceapp.hawkstorage.HawkStorage
import com.arfinrahmat.liveattendanceapp.views.login.LoginActivity
import com.arfinrahmat.liveattendanceapp.views.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        afterDelayGoToLogin()
    }

    private fun afterDelayGoToLogin() {
        Handler(Looper.getMainLooper()).postDelayed({
           checkIsLogin()
            startActivity<LoginActivity>()
            finishAffinity()
        }, 1200)
    }

    private fun checkIsLogin() {
        val isLogin = HawkStorage.instance(this).isLogin()
        if(isLogin){
            startActivity<MainActivity>()
            finishAffinity()
        }else{
            startActivity<LoginActivity>()
            finishAffinity()
        }
    }
}