package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignIn : AppCompatActivity() {

    lateinit var emailadresse: TextInputEditText
    lateinit var emailadressetxt: TextInputLayout
    lateinit var password: TextInputEditText
    lateinit var passwordtxt: TextInputLayout
   // lateinit var cbRememberMe: CheckBox
    lateinit var signinBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        fun validateSignIn(): Boolean {
            emailadressetxt.error = null
            passwordtxt.error = null

            if (emailadresse.text!!.isEmpty()){
                // emailadressetxt.error = getString(R.string.mustNotBeEmpty)
                return false
            }

            if (password.text!!.isEmpty()){
                //   passwordtxt.error = getString(R.string.mustNotBeEmpty)
                return false
            }

            return true
        }






    }
}