package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wang.avi.AVLoadingIndicatorView

class SplashScreen : AppCompatActivity() {

    lateinit var avi : AVLoadingIndicatorView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        avi = findViewById(R.id.avi)
        avi.show()

    }
}