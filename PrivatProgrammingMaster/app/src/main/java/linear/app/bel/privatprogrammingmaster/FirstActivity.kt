package linear.app.bel.privatprogrammingmaster

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        gambar.setOnClickListener {

        }

        button.setOnClickListener {

            var intent = Intent(this@FirstActivity, SecondActivity::class.java)
            intent.putExtra("variabel", "Hallo")
            startActivity(intent)
        }
    }
}
