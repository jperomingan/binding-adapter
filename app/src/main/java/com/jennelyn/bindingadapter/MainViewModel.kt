package com.jennelyn.bindingadapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Jennelyn Urot Peromingan on August 10, 2020, at 6:32 PM
 */
class MainViewModel : ViewModel() {
    val user = MutableLiveData<UserInfo>()

    init {
        user.value = UserInfo("Jea", "https://content.thriveglobal.com/wp-content/uploads/2018/11/Flower.jpg?w=1180")
    }
}