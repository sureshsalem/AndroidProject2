package com.example.androidproject2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidproject2.Model.Player
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : BaseActivity() {
 /*   var level =""
    var league =""*/
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        //league = intent.getStringExtra(EXTRA_LEAGUE)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
       // println(league)
    }

    fun beginnerLevelBtnClicked(view: View){
        advancedLevelBtn.isChecked = false
        player.level ="beginner"

    }

    fun advancedLevelBtnClicked(view: View){
        beginnerLevelBtn.isChecked = false
        player.level = "advanced"
    }


    fun finishLevelBtnClicked(view: View){

        if(player.level !=""){
            val finalintent = Intent(this,FinalScreen::class.java)
/*            finalintent.putExtra(EXTRA_LEVEL,level)
            finalintent.putExtra(EXTRA_LEAGUE,league)*/
            finalintent.putExtra(EXTRA_PLAYER,player)
            startActivity(finalintent)
        }
        else{
            Toast.makeText(this,"Please select a level", Toast.LENGTH_SHORT).show()
        }
    }

}