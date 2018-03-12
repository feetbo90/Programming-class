package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {


    var keyUsername : String = "username"
    var keyPassword : String = "password"

    var username : String = ""
    var password : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        var pref = applicationContext.getSharedPreferences("Login", 0)
        var editor = pref.edit()

        username = pref.getString(keyUsername, "")
        password = pref.getString(keyPassword, "")
        Toast.makeText(this@SharedPreference, "username : $username , password : $password ", Toast.LENGTH_LONG).show()


        // username = budi password = 1234, testing
        button.setOnClickListener {

            if(editusername.text.toString().equals("budi") && editpassword.text.toString().equals("1234"))
            {
                editor.putString(keyUsername, editusername.text.toString())
                editor.putString(keyPassword, editpassword.text.toString())
                editor.commit()
                Toast.makeText(this@SharedPreference, "Login berhasil", Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(this@SharedPreference, "Username atau Password tidak cocok", Toast.LENGTH_LONG).show()
            }

        }
    }
}
