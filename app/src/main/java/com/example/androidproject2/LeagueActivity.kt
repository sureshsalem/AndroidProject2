package com.example.androidproject2

import android.content.Intent
/*import androidx.appcompat.app.AppCompatActivity*/
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidproject2.Model.Player
import kotlinx.android.synthetic.main.activity_league.*

/*import kotlinx.android.synthetic.main.activity_league.**/

class LeagueActivity : BaseActivity() {

    //var SelectedLeague = ""
    var player = Player("","")

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

    fun mensLeagueBtnClicked(view: View){

       // SelectedLeague ="Mens"
        player.league="Mens"
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false



    }


    fun womensLeagueBtnClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league ="Womens"


    }


    fun coedLeagueBtnClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league ="Co-ed"

    }


    fun nextBtnClicked(view: View) {
        if(player.league != ""){
            val intent2 = Intent(this,LevelActivity::class.java)
           // intent2.putExtra(EXTRA_LEAGUE,SelectedLeague)
            //intent2.putExtra(EXTRA_LEAGUE,player)
            intent2.putExtra(EXTRA_PLAYER,player)
            startActivity(intent2)

        }else{
            Toast.makeText(this, "Please select a League",Toast.LENGTH_SHORT).show()
        }


    }




}