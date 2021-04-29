package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.wang.avi.AVLoadingIndicatorView

class SplashScreen : AppCompatActivity() {

    lateinit var avi : AVLoadingIndicatorView
    lateinit var message : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Cast()

    }

    fun Cast(){

        avi = findViewById(R.id.avi_SplashScreen_loading)
        message = findViewById(R.id.tv_SplashScreen_message)

    }
}