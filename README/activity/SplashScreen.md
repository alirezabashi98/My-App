# README SplashScreen.kt

Build an empty view

```
lateinit var avi: AVLoadingIndicatorView
lateinit var message: TextView
lateinit var reset: Button
```

The initialization is done with the cast method

‍‍```
fun Cast() {

        avi = findViewById(R.id.avi_SplashScreen_loading)
        message = findViewById(R.id.tv_SplashScreen_message)
        reset = findViewById(R.id.btn_SplashScreen_reset)

    }
```

Check the Internet connection with the is Network method

> If the Internet is connected, enter the MainActivity activity

> Otherwise, show that the Internet is not connected and show the test button again

```
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
```

Set the internet button to click again

> Hide and load button Show text Please wait and show

> Log in to MainActivity if the connection is established

```
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
```