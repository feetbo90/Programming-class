package linear.app.bel.privatprogrammingmaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio.*

class RadioActivity : AppCompatActivity() {

    var jenis_kelamin: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

        tekan.setOnClickListener {

            if(lk.isChecked)
            {
                jenis_kelamin = lk.text.toString()
            }else{
                jenis_kelamin = pr.text.toString()
            }

            text.text = jenis_kelamin

            if(lk2.isChecked)
            {
                Toast.makeText(this@RadioActivity, lk2.text.toString(), Toast.LENGTH_LONG).show()
            }
            if(pr2.isChecked){
                Toast.makeText(this@RadioActivity, pr2.text.toString(), Toast.LENGTH_LONG).show()

            }


        }

    }
}
