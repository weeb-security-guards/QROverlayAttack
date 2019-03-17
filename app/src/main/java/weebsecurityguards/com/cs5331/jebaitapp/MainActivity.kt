package weebsecurityguards.com.cs5331.jebaitapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.Gravity
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        backgroundToast()
    }

    private fun backgroundToast() {
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.qr_overlay_toast, findViewById(R.id.qr_overlay))
        val toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.setGravity(Gravity.CENTER, 0, 0);
        for (number in 1..10)
            toast.show()
    }
}
