package linear.app.bel.classlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_awal_bangun_ruang.*

class AwalBangunRuang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal_bangun_ruang)
        var pref = applicationContext.getSharedPreferences("Login", 0)
        var editor = pref.edit()


        segitiga.setOnClickListener {
            var intent = Intent(this@AwalBangunRuang, Segitiga::class.java)
            startActivity(intent)

            editor.clear()
            editor.commit()
        }

    }
}
