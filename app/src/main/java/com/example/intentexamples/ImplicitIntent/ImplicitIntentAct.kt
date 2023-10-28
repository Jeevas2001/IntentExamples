package com.example.intentexamples.ImplicitIntent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentexamples.R
import com.example.intentexamples.databinding.ActivityImplicitIntentBinding


class ImplicitIntentAct : AppCompatActivity()
{
    lateinit var implicit:ActivityImplicitIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        implicit=ActivityImplicitIntentBinding.inflate(layoutInflater)
        setContentView(implicit.root)

        implicit.button2.setOnClickListener {

            val url: String = implicit.urlEditText.getText().toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url))
            startActivity(intent)
        }


    }
}