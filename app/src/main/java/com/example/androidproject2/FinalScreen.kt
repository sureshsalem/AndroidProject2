package com.example.androidproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidproject2.Model.Player
import kotlinx.android.synthetic.main.activity_final_screen.*

class FinalScreen : AppCompatActivity() {
    //var league =""
    //var level =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)
/*        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val level = intent.getStringExtra(EXTRA_LEVEL)*/
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

/*        println("League:$league")
        println("Level: $level")*/

        resultTxtView.text = "Looking for ${player.league} with ${player.level} level near to you...."

       // println(league)
    }
}