package com.nttdata.test.everis_becamobile_android.domain.model.trending_films

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class JsonFilms(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int,
    @PrimaryKey(autoGenerate = true)
    val id:Int
)

fun jsonFilmsMock() = listOf(
    JsonFilms(
        1,
        listOf(
            Result(
                adult = false,
                "aaaaaa",
                "aaaaaa",
                listOf(2,3,4),
                1,
                "qwqwqewqe",
                "batman",
                listOf("br","ue"),
                "br",
                "The batman",
                "batmin",
                "223",
                8.4,
                "qweqwe",
                "3123123",
                "Bamin",
                true,
                9.5,
                3
            )
        ),
        6,
        2,
        2
    )
)

fun resultMock() = listOf(
    Result(
        adult = false,
        "aaaaaa",
        "aaaaaa",
        listOf(2,3,4),
        1,
        "qwqwqewqe",
        "batman",
        listOf("br","ue"),
        "br",
        "The batman",
        "batmin",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        8.4,
        "qweqwe",
        "3123123",
        "Bamin",
        true,
        8.4,
        3
    )
)