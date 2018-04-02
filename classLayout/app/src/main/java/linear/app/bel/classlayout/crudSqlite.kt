package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crud_sqlite.*
import linear.app.bel.classlayout.helper.DatabaseHelper

class crudSqlite : AppCompatActivity() {


    var db : DatabaseHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crud_sqlite)

        db = DatabaseHelper(this)

        input.setOnClickListener {

            var note = note.text.toString()
            createNote(note)
        }


    }

    fun createNote(note : String){
        var id = db?.insertNote(note)

    }
}
