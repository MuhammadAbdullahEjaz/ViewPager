package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        viewPager.adapter = ViewPager2Adapter(this)
        val tabLayout: TabLayout = findViewById(R.id.tablayout)
        TabLayoutMediator(tabLayout, viewPager){ _, _ ->

        }.attach()

    }

    fun dpToPx(dp: Int): Int {
        return dp * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}