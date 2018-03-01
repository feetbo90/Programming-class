package linear.app.bel.classlayout

/**
 * Created by root on 01/03/18.
 **/

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class ScoreActivity : AppCompatActivity() {

    var jumlah = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score)

        btn.setOnClickListener {
            jumlah = jumlah + 1
            text.text = "$jumlah"
        }

    }
}