package com.work.banderol.ui.screens

import androidx.fragment.app.Fragment
import com.work.banderol.R
import com.work.banderol.utilits.APP_ACTIVITY
import com.work.banderol.utilits.hideKeyboard

class MainFragment : Fragment(R.layout.fragment_chats) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Banderol"
        APP_ACTIVITY.mAppDrawer.enableDrawer()
        hideKeyboard()
    }
}
