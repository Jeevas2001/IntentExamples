package com.example.intentexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexamples.ExplicitIntent.ExplicitDashBoard
import com.example.intentexamples.ImplicitIntent.ImplicitIntentAct
import com.example.intentexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainAct:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAct=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainAct.root)

        mainAct.ExplicitBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, ExplicitDashBoard::class.java))
        }

        mainAct.ImplicitBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, ImplicitIntentAct::class.java))

        }

    }
}