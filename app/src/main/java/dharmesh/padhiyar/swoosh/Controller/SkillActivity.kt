package dharmesh.padhiyar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dharmesh.padhiyar.swoosh.R
import dharmesh.padhiyar.swoosh.Utilities.LEAGUE
import dharmesh.padhiyar.swoosh.Utilities.SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(LEAGUE)
    }

    fun onBeginnerClick(view: View) {
        baller.isChecked = false
        skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginner.isChecked = false
        skill = "baller"
    }

    fun onFinishClicked(view: View) {

        if (beginner.isChecked == false && baller.isChecked == false) {
            Toast.makeText(this, "Select your skill!", Toast.LENGTH_SHORT).show()
            return
        }

        val finish = Intent(this, FinishActivity::class.java)
        finish.putExtra(LEAGUE, league)
        finish.putExtra(SKILL, skill)
        startActivity(finish)
    }
}
