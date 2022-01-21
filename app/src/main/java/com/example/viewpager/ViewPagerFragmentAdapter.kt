package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerFragmentAdapter(fm: FragmentManager):FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        return fragment
    }

}