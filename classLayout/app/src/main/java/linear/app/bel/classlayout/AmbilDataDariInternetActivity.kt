package linear.app.bel.classlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.experimental.launch
import linear.app.bel.classlayout.network.SampleGetFromInternet
import linear.app.bel.cobacoroutine.experimental.Android
import java.io.IOException

class AmbilDataDariInternetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambil_data_dari_internet)


    }


    override fun onStart() {
        super.onStart()

        launch(Android){
        try{
            var result = SampleGetFromInternet.ambilDataDariInternet()
            Toast.makeText(this@AmbilDataDariInternetActivity, "sukses ${result.await()}", Toast.LENGTH_LONG).show()

        }catch (e : IOException){
            Toast.makeText(this@AmbilDataDariInternetActivity, "error ${e.message}", Toast.LENGTH_LONG).show()

        } }

    }
}
