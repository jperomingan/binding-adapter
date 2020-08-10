package com.jennelyn.bindingadapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Jennelyn Urot Peromingan on August 10, 2020, at 6:32 PM
 */
class MainViewModel : ViewModel() {
    val user = MutableLiveData<UserInfo>()

    init {
        user.value = UserInfo("Jea", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fblog.mayflower.in%2Fmake-birthday-special-with-flower-gift-basket-and-chocolate-bouquet%2F&psig=AOvVaw3SsH4xEcmxPYgFGC8rqAHI&ust=1597142676408000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJi-5aK6kOsCFQAAAAAdAAAAABAF")
    }
}