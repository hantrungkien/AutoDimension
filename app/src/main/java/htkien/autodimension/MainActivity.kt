package htkien.autodimension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_dpi)
        val dimenFileName = getString(R.string.dimenFileName)
        textView.text = dimenFileName

        Log.e(TAG, "onCreate: ${resources.configuration.smallestScreenWidthDp}")
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}