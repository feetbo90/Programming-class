package linear.app.bel.classlayout.model

/**
 * Created by root on 02/04/18.
 **/

class Note(){

    var id : Int? = 0
    var note : String? = null
    var timeStamp : String? = null

    constructor(id : Int, note : String, timeStamp: String):this(){
        this.id = id
        this.timeStamp = timeStamp
        this.note = note
    }


    companion object {

        val TABLE_NAME = "notes"

        val COLUMN_ID = "id"
        val COLUMN_NOTE = "note"
        val COLUMN_TIMESTAMP = "timestamp"


        // create table sql
        val CREATE_TABLE : String =
                "CREATE TABLE $TABLE_NAME ( $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_NOTE TEXT , $COLUMN_TIMESTAMP DATETIME DEFAULT CURRENT_TIMESTAMP)"

    }






}

