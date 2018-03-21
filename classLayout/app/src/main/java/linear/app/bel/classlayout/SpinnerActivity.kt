package linear.app.bel.classlayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)



        //spinner.setOnItemClickListener { adapterView, view, position , id ->

        //}

        spinner.onItemSelectedListener = CustomOnItemSelected()

        var list2 = mutableListOf<String>()
        list2.add("list 1")
        list2.add("list 2")
        list2.add("list 3")

        var arrayAdapter = ArrayAdapter<String>(this@SpinnerActivity, android.R.layout.simple_spinner_item, list2)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = arrayAdapter
        spinner2.onItemSelectedListener = CustomOnItemSelected()


        button.setOnClickListener {
            if(spinner.selectedItem.equals("France")) {
                var intent = Intent(this@SpinnerActivity, AwalBangunRuang::class.java)
                startActivity(intent)
            }
        }
    }

    class CustomOnItemSelected : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {

        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, posisi: Int, id: Long) {
            Toast.makeText(parent?.context, "${parent?.getItemAtPosition(posisi)}", Toast.LENGTH_LONG).show()


        }
    }
}
