package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_segitiga.*

class Segitiga : AppCompatActivity() {

    var alasDouble : Double = 0.0
    var tinggiDouble : Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        btn.setOnClickListener {

            if(!alas.equals("") && !tinggi.equals(""))
            {
                alasDouble = alas.text.toString().toDouble()
                tinggiDouble = tinggi.text.toString().toDouble()
                var luasdouble =( alasDouble * tinggiDouble ) / 2
                luas.text = "Maka luasnya : $luasdouble"

            }else {
                Toast.makeText(applicationContext, "Masukkan dengan benar", Toast.LENGTH_LONG).show()

            }


        }
    }
}
