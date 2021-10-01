package com.umesh.plantix.albumlist.persentation.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.umesh.plantix.R
import com.umesh.plantix.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            LoginUI()
        }, 2000)

    }


    private fun LoginUI() {
            startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}