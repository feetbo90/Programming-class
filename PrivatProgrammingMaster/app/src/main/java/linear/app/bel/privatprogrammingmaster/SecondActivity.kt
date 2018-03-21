package linear.app.bel.privatprogrammingmaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var ambil = getIntent().getStringExtra("variabel")
        Toast.makeText(this@SecondActivity, ambil, Toast.LENGTH_LONG).show()
    }
}
