package linear.app.bel.classlayout.helper

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import linear.app.bel.classlayout.model.Note
import java.io.IOException

/**
 * Created by root on 02/04/18.
 **/

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){



    companion object {
        // Database Version
        const val DATABASE_VERSION = 1

        // Database Name
        const val DATABASE_NAME = "notes_db"
    }

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL(Note.CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
// Drop older table if existed
        db?.execSQL("DROP TABLE IF EXISTS " + Note.TABLE_NAME);

        // Create tables again
        onCreate(db);

    }


    fun insertNote(note : String){
        var db = this.writableDatabase

        var values = ContentValues()
        values.put(Note.COLUMN_NOTE , note)

        try {
            var id = db.insert(Note.TABLE_NAME, null, values)
            Log.d("input", "BERHASIL")
        }catch (e : IOException){

            Log.d("input" , "GAGAL ${e.message}")
        }
    }




}
