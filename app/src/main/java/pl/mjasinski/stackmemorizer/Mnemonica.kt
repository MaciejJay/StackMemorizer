package pl.mjasinski.stackmemorizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mnemonica.*

class Mnemonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mnemonica)

        mnemonica1.setOnClickListener {
            startActivity(Intent(this, Mnemonica1::class.java))
        }

//        mnemonica2.setOnClickListener {
//            startActivity(Intent(this, Mnemonica2::class.java))
//        }
//
//        mnemonica3.setOnClickListener {
//            startActivity(Intent(this, Mnemonica3::class.java))
//        }
//
//        mnemonica4.setOnClickListener {
//            startActivity(Intent(this, Mnemonica4::class.java))
//        }
//
//        mnemonica5.setOnClickListener {
//            startActivity(Intent(this, Mnemonica5::class.java))
//        }
//
//        mnemonica6.setOnClickListener {
//            startActivity(Intent(this, Mnemonica6::class.java))
//        }
//
//        mnemonica7.setOnClickListener {
//            startActivity(Intent(this, Mnemonica7::class.java))
//        }
//
//        showMnemonica.setOnClickListener {
//            startActivity(Intent(this, MnemonicaStack::class.java))
//        }
    }
}