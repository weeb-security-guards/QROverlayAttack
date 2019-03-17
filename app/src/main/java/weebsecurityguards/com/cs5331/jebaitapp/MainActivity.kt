package weebsecurityguards.com.cs5331.jebaitapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Hehehehehe", Toast.LENGTH_LONG).show()
    }
}
