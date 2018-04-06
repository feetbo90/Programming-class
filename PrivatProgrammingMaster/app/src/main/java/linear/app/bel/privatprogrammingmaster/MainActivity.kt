package linear.app.bel.privatprogrammingmaster

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nameSharedPreferences = "login"
    var user = "username"
    var pass = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = this?.getSharedPreferences(nameSharedPreferences, Context.MODE_PRIVATE )
        var username = sharedPref.getString(user, "")
        var password = sharedPref.getString(pass, "")
        Toast.makeText(this, "$username dan $password", Toast.LENGTH_LONG).show()
    }
}
