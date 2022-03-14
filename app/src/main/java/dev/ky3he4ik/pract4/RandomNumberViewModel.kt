package dev.ky3he4ik.pract4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel private constructor(): ViewModel() {
    val currentRandomNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    companion object : SingletonHolder<RandomNumberViewModel>(::RandomNumberViewModel)
}
