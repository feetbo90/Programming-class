package linear.app.bel.classlayout

/**
 * Created by root on 01/03/18.
 **/

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.score.*


class ScoreActivity : AppCompatActivity() {

    var jumlah = 0
    var jumlah2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score)

        btnScore1.setOnClickListener {
            jumlah = jumlah + 1
            nilaiTeam1.text = "$jumlah"
        }

        btnScore2.setOnClickListener {
            jumlah = jumlah + 2
            nilaiTeam1.text = "$jumlah"
        }

        btnScore3.setOnClickListener {
            jumlah = jumlah + 3
            nilaiTeam1.text = "$jumlah"
        }


        btnScore1Team2.setOnClickListener {
            jumlah2 = jumlah2 + 1
            nilaiTeam2.text = "$jumlah2"
        }

        btnScore2Team2.setOnClickListener {
            jumlah2 = jumlah2 + 2
            nilaiTeam2.text = "$jumlah2"
        }
        btnScore3Team2.setOnClickListener {
            jumlah2 = jumlah2 + 3
            nilaiTeam2.text = "$jumlah2"
        }

    }
}