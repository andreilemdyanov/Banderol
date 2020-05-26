package com.work.banderol.ui.fragments

import com.work.banderol.R
import com.work.banderol.utilits.*
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
        REF_DATABASE_ROOT.child(NODE_USERS).child(UID).child(CHILD_BIO).setValue(mNewBio)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    showToast(getString(R.string.toast_data_update))
                    USER.bio = mNewBio
                    fragmentManager?.popBackStack()
                } else {
                    showToast(it.exception?.message.toString())
                }
            }
    }
}
