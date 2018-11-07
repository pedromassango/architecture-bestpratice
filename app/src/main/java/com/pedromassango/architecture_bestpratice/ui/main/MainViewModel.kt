package com.pedromassango.architecture_bestpratice.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedromassango.architecture_bestpratice.data.local.MyDatabase
import com.pedromassango.architecture_bestpratice.data.models.Phrase

class MainViewModel(private val database: MyDatabase) : ViewModel() {

    private val data = MutableLiveData<List<Phrase>>()


    fun getAllPhrases(): LiveData<List<Phrase>> = data

    fun loadAllData(){
        //TODO: load data

    }

    fun savePhrase(phrase: Phrase){

    }

}