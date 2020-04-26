package com.diki.idn.pretest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arithmeticOperation = arrayOf("Balok", "Limas")

        if (spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arithmeticOperation)

            spinner.adapter = arrayAdapter
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

                override fun onItemSelected(p0: AdapterView<*>, p1: View?, p2: Int, p3: Long) {
                    when (p0.selectedItem.toString()) {
                        arithmeticOperation[0] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    BalokFragment(),
                                    BalokFragment::class.java.simpleName
                                ).commit()
                        }
                        arithmeticOperation[1] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    LimasFragment(),
                                    LimasFragment::class.java.simpleName
                                ).commit()
                        }
                    }
                }
            }
        }
    }
}
