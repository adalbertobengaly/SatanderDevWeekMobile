package com.bootcamp.santanderdevwek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bootcamp.santanderdevwek.data.Conta
import com.bootcamp.santanderdevwek.data.local.FakeData

class MainViewModel : ViewModel() {


    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCLiente(): LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}