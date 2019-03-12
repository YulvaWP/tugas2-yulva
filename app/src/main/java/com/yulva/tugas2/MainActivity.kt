package com.yulva.tugas2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val putarButton: Button = findViewById(R.id.btn)

        putarButton.text = "start"
        putarButton.setOnClickListener {

            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        }
        putarButton.setOnClickListener { kocokDadu() }

    }
    fun kocokDadu() {
        val randomInt = Random().nextInt(7)+1
        val drawableResource = when (randomInt){
            1 -> R.drawable.ayulest
            2 -> R.drawable.citra
            3 -> R.drawable.fuji
            4 -> R.drawable.hanum
            5 -> R.drawable.lis
            6 -> R.drawable.yulva
            else -> R.drawable.mela
        }
        val yulva : ImageView = findViewById(R.id.cewek)
        cewek.setImageResource(drawableResource)

        val randomInt1 = Random().nextInt(7)+1
        val drawableResource1 = when (randomInt1){
            1 -> R.drawable.b
            2 -> R.drawable.bbb
            3 -> R.drawable.deni
            4 -> R.drawable.edi
            5 -> R.drawable.egi
            6 -> R.drawable.filipus
            7 -> R.drawable.filipus
            else -> R.drawable.huda
        }
        val alim : ImageView = findViewById(R.id.cowok)
        cowok.setImageResource(drawableResource1)
    }
}
