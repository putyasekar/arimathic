package com.diki.idn.pretest1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_limas.*

class LimasFragment : Fragment() {
    private lateinit var inputFirst: String
    private lateinit var inputSecond: String
    private lateinit var inputThird: String
    private var result: Double? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_limas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calculate_limas.setOnClickListener {
            inputFirst = volume_limas.text.toString().trim()
            inputSecond = luasalas_limas.text.toString().trim()
            inputThird = tinggi_limas.text.toString().trim()

            if (inputFirst.isEmpty()) {
                result = (inputSecond.toDouble() * inputThird.toDouble()) * 0.33
                result_limas.setText(result.toString())
            } else if (inputSecond.isEmpty()) {
                result = (inputFirst.toDouble() / inputThird.toDouble()) * 0.33
                result_limas.setText(result.toString())
            } else if (inputThird.isEmpty()) {
                result = (inputFirst.toDouble() / inputSecond.toDouble()) * 0.33
                result_limas.setText(result.toString())
            }
        }
    }

}