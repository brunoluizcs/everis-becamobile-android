package com.nttdata.test.everis_becamobile_android.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GenresJson(
    val genres: List<Genre>,
    @PrimaryKey(autoGenerate = true)
    val id:Int
)