package com.sirketismi.tatilcase

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewNoteViewModel: ViewModel() {
    var titleText = MutableLiveData<String>()
    var navigatePreviousPage = MutableLiveData<Boolean>()

    fun onButtonClick() {
        navigatePreviousPage.postValue(true)
    }
}