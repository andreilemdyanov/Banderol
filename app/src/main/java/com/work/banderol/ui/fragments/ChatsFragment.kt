package com.work.banderol.ui.fragments

import androidx.fragment.app.Fragment
import com.work.banderol.R
import com.work.banderol.utilits.APP_ACTIVITY

class ChatsFragment : Fragment(R.layout.fragment_chats) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Чаты"
    }
}
