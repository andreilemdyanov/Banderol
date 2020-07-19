package com.work.banderol.ui.screens

import com.work.banderol.R
import com.work.banderol.database.*
import kotlinx.android.synthetic.main.fragment_change_bio.*


class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_change_bio) {

    lateinit var mNewBio: String

    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        mNewBio = settings_input_bio.text.toString()
        setBioDatabase(mNewBio)
    }
}
