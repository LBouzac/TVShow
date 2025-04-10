package com.films.tvshow.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("tv_show")
data class TVShow(
    @Id // Indique la clé primaire
    var id: Long? = null,
    var name: String? = null,
    var genre: String? = null,
    var seasons: Int? = null
)