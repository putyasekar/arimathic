package com.diki.idn.pretest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //panggil view pager
        main_vp.adapter = Adapter(supportFragmentManager)

        //panggil tab layout
        main_tab.setupWithViewPager(main_vp)
    }
}
