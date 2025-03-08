package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.Model.User
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUp : AppCompatActivity() {

    lateinit var firstname: TextInputEditText
    lateinit var firstnametxt: TextInputLayout
    lateinit var emailadresse: TextInputEditText
    lateinit var emailadressetxt: TextInputLayout
    lateinit var password: TextInputEditText
    lateinit var passwordtxt: TextInputLayout
    lateinit var mobile: TextInputEditText
    lateinit var mobiletxt: TextInputLayout
    lateinit var adresse: TextInputEditText
    lateinit var adressetxt: TextInputLayout
    // lateinit var cbRememberMe: CheckBox
    lateinit var signinBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        
    }
}