package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            var editNama = nama.text.toString()
            text.text = "Hallo : $editNama"
            //text.setText("Hallo : $editNama")
        }


    }
}
