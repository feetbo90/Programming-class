package linear.app.bel.privatprogrammingmaster

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shared_preferences.*

class SharedPreferencesActivity : AppCompatActivity() {

    var nameSharedPreferences = "login"
    var user = "username"
    var pass = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        val sharedPref = this?.getSharedPreferences(nameSharedPreferences, Context.MODE_PRIVATE )


        button.setOnClickListener {

            if(username.text.toString().equals("pandu") && password.text.toString().equals("1234")){

                with(sharedPref.edit()){
                    putString(user, username.text.toString())
                    putString(pass, password.text.toString())
                    commit()
                }
                var intent = Intent(this@SharedPreferencesActivity, MainActivity::class.java)
                startActivity(intent)

            }

        }
    }
}
