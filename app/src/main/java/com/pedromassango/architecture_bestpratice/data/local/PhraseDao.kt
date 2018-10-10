package com.pedromassango.architecture_bestpratice.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.pedromassango.architecture_bestpratice.data.models.Phrase

@Dao
interface PhraseDao{

    @Insert
    fun insert(phrase: Phrase)

    @Query("SELECT * FROM phrases_table")
    fun getAll(): List<Phrase>

}