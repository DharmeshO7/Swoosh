package dharmesh.padhiyar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import dharmesh.padhiyar.swoosh.Model.Player
import dharmesh.padhiyar.swoosh.R
import dharmesh.padhiyar.swoosh.Utilities.PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

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
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(PLAYER)
    }

    fun onBeginnerClick(view: View) {
        baller.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginner.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked(view: View) {

        if (beginner.isChecked == false && baller.isChecked == false) {
            Toast.makeText(this, "Select your skill!", Toast.LENGTH_SHORT).show()
            return
        }

        val finish = Intent(this, FinishActivity::class.java)
        finish.putExtra(PLAYER, player)
        startActivity(finish)
    }
}
