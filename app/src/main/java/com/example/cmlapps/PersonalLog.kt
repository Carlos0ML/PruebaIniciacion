package com.example.cmlapps

import android.util.Log
import javax.inject.Inject

class PersonalLog @Inject constructor() {

    fun log(message: String) {
        Log.d("CML", message)

    }

}