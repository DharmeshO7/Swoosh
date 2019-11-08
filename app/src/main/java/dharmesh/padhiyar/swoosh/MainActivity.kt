package dharmesh.padhiyar.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStarted.setOnClickListener {
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}
