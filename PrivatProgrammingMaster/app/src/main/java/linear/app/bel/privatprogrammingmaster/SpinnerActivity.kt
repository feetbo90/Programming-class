package linear.app.bel.privatprogrammingmaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)


        var list = mutableListOf<String>()
        list.add("AC Milan")
        list.add("Real Madrid")
        list.add("Bayern Munchen")

        var arrayAdapter = ArrayAdapter<String>(this@SpinnerActivity, android.R.layout.simple_spinner_item, list)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = CustomSelectedListener()

    }


    class CustomSelectedListener: AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {

        }

        override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, posisi: Int, id: Long) {

            Toast.makeText(adapterView?.context, "${adapterView?.getItemAtPosition(posisi)}", Toast.LENGTH_LONG ).show()

            if(adapterView?.getItemAtPosition(posisi)!!.equals("AC Milan"))
            {
              //  var intent
            }

        }
    }


}
