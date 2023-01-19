package com.uzb7.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var displey:TextView
    lateinit var natija:TextView
    var numbertext:String=""
    var textnumber:Int=0
    var amal:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    @SuppressLint("WrongViewCast")
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
        val bOchirish=findViewById<Button>(R.id.b_ochirish)
        val bpilusminus=findViewById<Button>(R.id.b_plus_minus)
        val bplus=findViewById<Button>(R.id.b_qoshish)
        val bminus=findViewById<Button>(R.id.b_ayirish)
        val bkopaytirish=findViewById<Button>(R.id.b_kopaytirish)
        val bbolish=findViewById<Button>(R.id.b_bolish)
        val bbarobar=findViewById<Button>(R.id.b_teng)
        natija=findViewById(R.id.tv_javob)
        displey=findViewById(R.id.tv_kiritish)
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
        bOchirish.setOnClickListener(this)
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
            R.id.b_1->{ yozish("1") }
            R.id.b_2->{ yozish("2") }
            R.id.b_3->{ yozish("3") }
            R.id.b_4->{ yozish("4") }
            R.id.b_5->{ yozish("5") }
            R.id.b_6->{ yozish("6") }
            R.id.b_7->{ yozish("7") }
            R.id.b_8->{ yozish("8") }
            R.id.b_9->{ yozish("9") }
            R.id.b_0->{ yozish("0") }
            R.id.b_c->{
                natija.text=""
                displey.text=""
            }
            R.id.b_ochirish->{
                var s=displey.text
                var a = ""
                displey.text=""
                for(i in 0 until s.length-1){
                    a+=s[i]
                }
                displey.text = a
            }
        }
    }

    private fun yozish(s: String) {
        numbertext+=s
        displey.text=numbertext
        if(!displey.text.toString().contains("+")&&!displey.text.toString().contains("-")&&!displey.text.toString().contains("*")&&!displey.text.toString().contains("/")){
            natija.text=displey.text
        }
    }
}