# README CheckedNetwork.kt

> A context is taken from the input

```
class CheckedNetwork(val context: Context) {...}
```

Check if the internet code is connected or not

```
fun  isNetworkAvailbale():Boolean{
        val conManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val internetInfo = conManager.activeNetworkInfo
        return internetInfo!=null && internetInfo.isConnected
    }
```