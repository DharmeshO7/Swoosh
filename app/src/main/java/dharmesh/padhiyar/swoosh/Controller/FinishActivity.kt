package dharmesh.padhiyar.swoosh.Controller

import android.os.Bundle
import dharmesh.padhiyar.swoosh.R
import dharmesh.padhiyar.swoosh.Utilities.LEAGUE
import dharmesh.padhiyar.swoosh.Utilities.SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(LEAGUE)
        val skill = intent.getStringExtra(SKILL)

        searchLeagueTxt.text = "Looking for a $league $skill near you..."
    }
}
