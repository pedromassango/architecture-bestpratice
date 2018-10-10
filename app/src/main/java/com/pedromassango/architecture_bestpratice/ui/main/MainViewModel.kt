package com.pedromassango.architecture_bestpratice.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.pedromassango.architecture_bestpratice.data.models.Phrase

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Phrase>>()


    fun getAllPhrases(): LiveData<List<Phrase>> = data

    fun loadAllData(){
        //TODO: load data

    }

    fun savePhrase(phrase: Phrase){

    }

}