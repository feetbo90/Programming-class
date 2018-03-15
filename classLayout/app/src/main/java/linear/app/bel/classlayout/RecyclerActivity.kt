package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import linear.app.bel.classlayout.adapter.CustomAdapter
import linear.app.bel.classlayout.model.User

class RecyclerActivity : AppCompatActivity(), CustomAdapter.onSuggestResultListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val rv = findViewById<RecyclerView>(R.id.recyclerView1)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<User>()
        users.add(User("Paul", "Mr"))
        users.add(User("Jane", "Miss"))
        users.add(User("John", "Dr"))
        users.add(User("Amy", "Mrs"))

        var adapter = CustomAdapter(users)
        adapter?.setOnSuggestResultListener(this)
        rv.adapter = adapter
    }

    override fun onSuggestResult(posisi: Int) {
        Toast.makeText(applicationContext, "$posisi", Toast.LENGTH_LONG).show()
    }
}
