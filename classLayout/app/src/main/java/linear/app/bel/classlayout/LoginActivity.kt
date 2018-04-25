package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.coroutines.experimental.launch
import linear.app.bel.classlayout.network.SampleGetFromInternet
import linear.app.bel.cobacoroutine.experimental.Android
import java.io.IOException

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        button.setOnClickListener {
            var user = username.text.toString()
            var password = password.text.toString()
            launch(Android){
                try{
                    var result = SampleGetFromInternet.Login(user, password)
                    Toast.makeText(this@LoginActivity, "${result.await()}", Toast.LENGTH_LONG).show()

                }catch (e : IOException){
                    Toast.makeText(this@LoginActivity, "error ${e.message}", Toast.LENGTH_LONG).show()

                } }

        }

    }
}
