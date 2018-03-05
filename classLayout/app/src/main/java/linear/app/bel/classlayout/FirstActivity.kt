package linear.app.bel.classlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        val intent = Intent(this@FirstActivity, SecondActivity::class.java)
        intent.putExtra("nilai", "1")
        startActivity(intent)


    }
}
