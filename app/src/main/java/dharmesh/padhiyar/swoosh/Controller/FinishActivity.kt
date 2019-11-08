package dharmesh.padhiyar.swoosh.Controller

import android.os.Bundle
import dharmesh.padhiyar.swoosh.Model.Player
import dharmesh.padhiyar.swoosh.R
import dharmesh.padhiyar.swoosh.Utilities.PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(PLAYER)

        searchLeagueTxt.text = "Looking for a ${player.league} ${player.skill} near you..."
    }
}
