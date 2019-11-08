package dharmesh.padhiyar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dharmesh.padhiyar.swoosh.Utilities.LEAGUE
import dharmesh.padhiyar.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

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
        intent.putExtra(LEAGUE, selectedLeague)
        startActivity(intent)
    }

    fun onMensClicked(view: View) {
        womens.isChecked = false
        coed.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mens.isChecked = false
        coed.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        mens.isChecked = false
        womens.isChecked = false
        selectedLeague = "coed"
    }
}
