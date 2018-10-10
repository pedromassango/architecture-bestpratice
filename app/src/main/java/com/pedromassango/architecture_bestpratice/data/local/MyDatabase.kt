package com.pedromassango.architecture_bestpratice.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pedromassango.architecture_bestpratice.data.models.Phrase

@Database(entities = [Phrase::class], version = 1)
abstract class MyDatabase: RoomDatabase() {

    abstract fun phraseDao(): PhraseDao


    private var INSTANCE: MyDatabase? = null

    fun getInstance(context: Context): MyDatabase{
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(
                    context,
                    MyDatabase::class.java,
                    "prhases_database")
                    .allowMainThreadQueries()
                    .build()
        }

        return INSTANCE!!
    }

}