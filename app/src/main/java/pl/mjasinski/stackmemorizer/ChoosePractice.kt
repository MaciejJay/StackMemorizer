package pl.mjasinski.stackmemorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_practice.*

class ChoosePractice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_practice)

        mnemonicaPracticeButton.setOnClickListener {
            startActivity(Intent(this, Mnemonica::class.java))
        }
    }
}