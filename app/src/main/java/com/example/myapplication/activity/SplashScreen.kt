package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.utility.CheckedNetwork
import com.wang.avi.AVLoadingIndicatorView

class SplashScreen : AppCompatActivity() {

    lateinit var avi: AVLoadingIndicatorView
    lateinit var message: TextView
    lateinit var reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Cast()

//        Check your internet connection
        isNetwork()

//        When you click the button
        onClickReset()

    }

    fun Cast() {

        avi = findViewById(R.id.avi_SplashScreen_loading)
        message = findViewById(R.id.tv_SplashScreen_message)
        reset = findViewById(R.id.btn_SplashScreen_reset)

    }

    //        Check your internet connection
    fun isNetwork() {


        if (CheckedNetwork(this).isNetworkAvailbale()) {

            Handler().postDelayed({

                startActivity(Intent(this, MainActivity::class.java))

            }, 2000)

        } else {

            avi.hide()
            reset.visibility = View.VISIBLE
            message.text = "You are not connected to the internet. Try again"

        }


    }

    //        When you click the button
    fun onClickReset() {
        reset.setOnClickListener {

            avi.show()
            reset.visibility = View.INVISIBLE
            message.text = "Loading..."

            Handler().postDelayed({

                isNetwork()

            }, 1000)
        }
    }
}