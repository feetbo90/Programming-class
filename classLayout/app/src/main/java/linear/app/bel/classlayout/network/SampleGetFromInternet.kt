package linear.app.bel.classlayout.network

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * Created by root on 28/03/18.
 **/

object SampleGetFromInternet{


    val client = OkHttpClient()


/*    fun ambilData(): String{

    }*/

    fun ambilDataDariInternet():Deferred<String>{

        return  async (CommonPool){
            val request = Request.Builder().url("http://bpjs.dhuocreative.com/bpjs/ambildata.html").build()
            client.newCall(request).execute().body().string()
        }
    }


    fun Login(username: String, password: String):Deferred<String>{

        return async (CommonPool){
            val request = Request.Builder().url("http://bpjs.dhuocreative.com/bpjs/ceklogin.php?username=${username}&password=${password}").build()
            client.newCall(request).execute().body().string()
        }
    }

}
