package com.diki.idn.pretest1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pages = listOf(
        BalokFragment(),
        LimasFragment()
    )

    //menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    //untuk menghitung data yang akan ditampilkan
    override fun getCount(): Int {
        return pages.size
    }

    //membuat judul
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Balok"
            else -> "Limas"
        }
    }
}
