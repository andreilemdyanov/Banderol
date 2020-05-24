package com.work.banderol.ui.fragments

import com.google.firebase.auth.PhoneAuthProvider
import com.work.banderol.MainActivity
import com.work.banderol.R
import com.work.banderol.ui.activities.RegisterActivity
import com.work.banderol.utilits.AUTH
import com.work.banderol.utilits.AppTextWatcher
import com.work.banderol.utilits.replaceActivity
import com.work.banderol.utilits.showToast
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment(val phoneNumber: String, val id: String) :
    BaseFragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        (activity as RegisterActivity).title = phoneNumber
        register_input_code.addTextChangedListener(AppTextWatcher {
            val string = register_input_code.text.toString()
            if (string.length == 6) {
                enterCode()
            }
        })
    }

    private fun enterCode() {
        val code = register_input_code.text.toString()
        val credential = PhoneAuthProvider.getCredential(id, code)
        AUTH.signInWithCredential(credential).addOnCompleteListener {
            if (it.isSuccessful) {
                showToast("Добро пожаловать")
                (activity as RegisterActivity).replaceActivity(MainActivity())
            } else {
                showToast(it.exception?.message.toString())
            }
        }
    }
}
