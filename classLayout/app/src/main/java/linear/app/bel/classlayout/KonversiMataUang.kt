package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_konversi_mata_uang.*

class KonversiMataUang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_mata_uang)

        radioGroup.setOnCheckedChangeListener { radioGroup, id ->

            var radio = findViewById<RadioButton>(id)
            var text = radio.text.toString().trim()
            var inputFromUser = input.text.toString().trim()
            if(text.equals("Dollar"))
            {
                var inputInt = inputFromUser.toInt()
                var konversi = inputInt / 13000
                Toast.makeText(this@KonversiMataUang, "$konversi", Toast.LENGTH_LONG).show()
            }else if(text.equals("Euro")){

            }

        }
    }
}
