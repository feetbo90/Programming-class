package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio_group.*

class RadioGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_group)

        btn.setOnClickListener {

            if(lk.isChecked){


                Toast.makeText(this@RadioGroupActivity, "Laki - Laki", Toast.LENGTH_LONG).show()

            }else if(pr.isChecked)
                Toast.makeText(this@RadioGroupActivity, "Perempuan ", Toast.LENGTH_LONG).show()


            if(lk2.isChecked)
                Toast.makeText(this@RadioGroupActivity, "Laki - Laki ", Toast.LENGTH_LONG).show()

        }

        radioGroup.setOnCheckedChangeListener { radioGroup, id ->

//            if (R.id.lk == i)
            //radioGroup.checkedRadioButtonId
            var radio = findViewById<RadioButton>(id)
            var text = radio.text.toString()
            Toast.makeText(this@RadioGroupActivity, text, Toast.LENGTH_LONG).show()

        }


    }
}
