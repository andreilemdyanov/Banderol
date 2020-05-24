package com.work.banderol.ui.fragments

import com.work.banderol.R
import com.work.banderol.utilits.AppTextWatcher
import com.work.banderol.utilits.showToast
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : BaseFragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(AppTextWatcher {
            val string = register_input_code.text.toString()
            if (string.length == 6) {
                verifyCode()
            }
        })
    }

    private fun verifyCode() {
        showToast("Ok")
    }
}
