package com.example.intentexamples.ExplicitIntent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexamples.R
import com.example.intentexamples.databinding.ActivityExplicitOutPutBinding

class ExplicitOutPut : AppCompatActivity()
{
lateinit var output:ActivityExplicitOutPutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_out_put)

        output= ActivityExplicitOutPutBinding.inflate(layoutInflater)
        setContentView(output.root)

        output.PasstextView.text=intent.extras?.getString("passData")?:"No Data"

    }
}