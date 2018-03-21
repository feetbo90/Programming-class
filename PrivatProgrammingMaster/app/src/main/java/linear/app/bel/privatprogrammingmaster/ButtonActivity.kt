package linear.app.bel.privatprogrammingmaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)


        push.setOnClickListener {

            var Nama = nama.getText().toString()
            Toast.makeText(this@ButtonActivity, Nama, Toast.LENGTH_LONG).show()
        }
    }
}
