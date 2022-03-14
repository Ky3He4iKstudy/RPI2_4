package dev.ky3he4ik.pract4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.getRnd).setOnClickListener {
            RandomNumberViewModel.getInstance().currentRandomNumber.value = (0..50).random()
        }

        RandomNumberViewModel.getInstance().currentRandomNumber.observe(this) {
            findViewById<EditText>(R.id.rndNum).setText(it.toString())
        }
        findViewById<EditText>(R.id.rndNum).setText(RandomNumberViewModel.getInstance().currentRandomNumber.value?.toString() ?: "-")
    }
}
