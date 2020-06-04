package com.work.banderol.ui.fragments

import androidx.fragment.app.Fragment
import com.work.banderol.MainActivity
import com.work.banderol.utilits.APP_ACTIVITY

open class BaseFragment(layout: Int) : Fragment(layout) {

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}

