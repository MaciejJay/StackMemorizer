package pl.mjasinski.stackmemorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        settingsButton.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }

        practiceButton.setOnClickListener {
            startActivity(Intent(this, ChoosePractice::class.java))
        }

        testButton.setOnClickListener {
            startActivity(Intent(this, ChooseTest::class.java))
        }
    }
}