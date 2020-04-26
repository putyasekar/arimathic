package com.diki.idn.pretest1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_balok.*

class BalokFragment : Fragment() {
    private lateinit var inputFirst: String
    private lateinit var inputSecond: String
    private lateinit var inputThird: String
    private lateinit var inputFourth: String
    private var result: Double? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_balok, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calculate_balok.setOnClickListener {
            inputFirst = volume_balok.text.toString().trim()
            inputSecond = panjang_balok.text.toString().trim()
            inputThird = lebar_balok.text.toString().trim()
            inputFourth = tinggi_balok.text.toString().trim()

            if (inputFirst.isEmpty()) {
                result =
                    (inputSecond.toDouble() * inputThird.toDouble() * inputFourth.toDouble())
                result_balok.setText(result.toString())
            } else if (inputSecond.isEmpty()) {
                result =
                    (inputFirst.toDouble() / inputThird.toDouble() * inputFourth.toDouble())
                result_balok.setText(result.toString())

            } else if (inputThird.isEmpty()) {
                result =
                    (inputFirst.toDouble() / inputSecond.toDouble() * inputFourth.toDouble())
                result_balok.setText(result.toString())
            } else if (inputFourth.isEmpty())
                result =
                    (inputFirst.toDouble() / inputSecond.toDouble() * inputThird.toDouble())
            result_balok.setText(result.toString())
        }
    }
}

