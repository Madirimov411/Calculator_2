package com.uzb7.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var displey:EditText
    lateinit var natija:TextView
    var numbertext:String=""
    var textnumber:Int=0
    var amal:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    private fun initview() {
        val bone=findViewById<Button>(R.id.b_1)
        val btwo=findViewById<Button>(R.id.b_2)
        val bthree=findViewById<Button>(R.id.b_3)
        val bfour=findViewById<Button>(R.id.b_4)
        val bfive=findViewById<Button>(R.id.b_5)
        val bsex=findViewById<Button>(R.id.b_6)
        val bseven=findViewById<Button>(R.id.b_7)
        val bheigt=findViewById<Button>(R.id.b_8)
        val bnine=findViewById<Button>(R.id.b_9)
        val bzero=findViewById<Button>(R.id.b_0)
        val bAC=findViewById<Button>(R.id.b_c)
        val bpilusminus=findViewById<Button>(R.id.b_plus_minus)
        val bplus=findViewById<Button>(R.id.b_qoshish)
        val bminus=findViewById<Button>(R.id.b_ayirish)
        val bkopaytirish=findViewById<Button>(R.id.b_kopaytirish)
        val bbolish=findViewById<Button>(R.id.b_bolish)
        val bbarobar=findViewById<Button>(R.id.b_teng)
        natija=findViewById(R.id.tv_javob)
        displey=findViewById(R.id.et_kiritish)
        bone.setOnClickListener(this)
        btwo.setOnClickListener(this)
        bthree.setOnClickListener(this)
        bfour.setOnClickListener(this)
        bfive.setOnClickListener(this)
        bsex.setOnClickListener(this)
        bseven.setOnClickListener(this)
        bheigt.setOnClickListener(this)
        bnine.setOnClickListener(this)
        bzero.setOnClickListener(this)
        bfive.setOnClickListener(this)
        bsex.setOnClickListener(this)
        bseven.setOnClickListener(this)
        bheigt.setOnClickListener(this)
        bnine.setOnClickListener(this)
        bzero.setOnClickListener(this)
        bAC.setOnClickListener(this)
        bpilusminus.setOnClickListener(this)
        bplus.setOnClickListener(this)
        bminus.setOnClickListener(this)
        bkopaytirish.setOnClickListener(this)
        bbolish.setOnClickListener(this)
        bbarobar.setOnClickListener(this)
    }

    override fun onClick(button: View?) {
        val id=button?.id
        when(id){
            R.id.b_1->{
                numbertext+="1"
                displey.setText(numbertext)
            }
            R.id.b_2->{
                numbertext+="2"
                displey.setText(numbertext)
            }
            R.id.b_3->{
                numbertext+="3"
                displey.setText(numbertext)
            }
            R.id.b_4->{
                numbertext+="4"
                displey.setText(numbertext)
            }
            R.id.b_5->{
                numbertext+="5"
                displey.setText(numbertext)
            }
            R.id.b_6->{
                numbertext+="6"
                displey.setText(numbertext)
            }
            R.id.b_7->{
                numbertext+="7"
                displey.setText(numbertext)
            }
            R.id.b_8->{
                numbertext+="8"
                displey.setText(numbertext)
            }R.id.b_9->{
            numbertext+="9"
            displey.setText(numbertext)
            }
            R.id.b_0->{
            numbertext+="0"
            displey.setText(numbertext)
            }
        }
    }
}