package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel: ViewModel() {
    val total = MutableLiveData<Int>(0)
    fun incrementTotal(): LiveData<Int> {
        total.value = (total.value?: 0) + 1

        return total
    }
}