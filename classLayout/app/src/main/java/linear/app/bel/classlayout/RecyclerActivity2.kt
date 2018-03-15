package linear.app.bel.classlayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_layout_recycler.*
import kotlinx.android.synthetic.main.activity_recycler.*
import linear.app.bel.classlayout.adapter.CustomAdapter
import linear.app.bel.classlayout.adapter.DataLayout
import linear.app.bel.classlayout.adapter.RecyclerAdapter
import linear.app.bel.classlayout.model.User

/**
 * Created by root on 15/03/18.
 **/
class RecyclerActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_recycler)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        var users = ArrayList<User>()

        users.add(User("John", "Dr"))
        users.add(User("Amy", "Mrs"))

        var adapter = DataLayout(users)
        //adapter?.setOnSuggestResultListener(this)
        recyclerView.adapter = adapter
    }

/*    override fun onSuggestResult(posisi: Int) {
        Toast.makeText(applicationContext, "$posisi", Toast.LENGTH_LONG).show()
    }*/
}
