package com.example.androidproject2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : BaseActivity() {
    var level =""
    var league =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun beginnerLevelBtnClicked(view: View){
        advancedLevelBtn.isChecked = false
        level ="beginner"

    }

    fun advancedLevelBtnClicked(view: View){
        beginnerLevelBtn.isChecked = false
        level = "advanced"
    }


    fun finishLevelBtnClicked(view: View){

        if(level !=""){
            val finalintent = Intent(this,FinalScreen::class.java)
            finalintent.putExtra(EXTRA_LEVEL,level)
            finalintent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finalintent)
        }
        else{
            Toast.makeText(this,"Please select a level", Toast.LENGTH_SHORT).show()
        }
    }

}