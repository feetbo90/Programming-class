package linear.app.bel.privatprogrammingmaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recycler.*
import linear.app.bel.privatprogrammingmaster.adapter.DataLayout
import linear.app.bel.privatprogrammingmaster.model.User

class RecyclerActivity : AppCompatActivity(), DataLayout.onSuggestResultListener {

    var users = ArrayList<User>()
    override fun onSuggestResult(posisi: Int) {


        Toast.makeText(applicationContext, "${users.get(posisi)}", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        users.add(User("Pandu", "Garu II"))
        users.add(User("Bla bla", "alamat"))

        var adapter2 = DataLayout(users)
        adapter2.setOnSuggestResultListener(this)
        recyclerview.adapter = adapter2







    }
}
