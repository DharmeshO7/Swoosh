package dharmesh.padhiyar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dharmesh.padhiyar.swoosh.Model.Player
import dharmesh.padhiyar.swoosh.R
import dharmesh.padhiyar.swoosh.Utilities.PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(PLAYER)!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun clickNext(view: View) {

        if (mens.isChecked == false && womens.isChecked == false && coed.isChecked == false) {
            Toast.makeText(this, "Select a league!", Toast.LENGTH_SHORT).show()
            return
        }

        val intent = Intent(this, SkillActivity::class.java)
        intent.putExtra(PLAYER, player)
        startActivity(intent)
    }

    fun onMensClicked(view: View) {
        womens.isChecked = false
        coed.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mens.isChecked = false
        coed.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        mens.isChecked = false
        womens.isChecked = false
        player.league = "coed"
    }
}
