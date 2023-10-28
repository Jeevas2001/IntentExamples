package com.example.intentexamples.ExplicitIntent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexamples.R
import com.example.intentexamples.databinding.ActivityExplicitDashBoardBinding

class ExplicitDashBoard : AppCompatActivity()
{
    lateinit var ExplictAct:ActivityExplicitDashBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_dash_board)

        ExplictAct= ActivityExplicitDashBoardBinding.inflate(layoutInflater)
        setContentView(ExplictAct.root)

        ExplictAct.button.setOnClickListener {
            var getMsg=ExplictAct.editTextText.text.toString()
            var intent=Intent(applicationContext, ExplicitOutPut::class.java)
            intent.putExtra("passData",getMsg)
            startActivity(intent)

        }
    }
}