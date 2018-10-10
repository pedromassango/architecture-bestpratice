package com.pedromassango.architecture_bestpratice.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "phrases_table")
data class Phrase(
        @PrimaryKey( autoGenerate = true)
        var id: Int = 0,
        var text: String
)