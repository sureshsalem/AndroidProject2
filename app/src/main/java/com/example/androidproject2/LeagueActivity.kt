package com.example.androidproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

/*        nextBtn.setOnClickListener{ it: View? ->
            val intent2 = Intent(this,LevelActivity::class.java)
            startActivity(intent2)

        }*/
    }

 /*       fun nextBtnClicked(view: View){
            val intent2 = Intent(this,LevelActivity::class.java)
            startActivity(intent2)

        }*/

    fun nextBtnClicked(view: View) {
        val intent2 = Intent(this,LevelActivity::class.java)
        startActivity(intent2)

    }
}