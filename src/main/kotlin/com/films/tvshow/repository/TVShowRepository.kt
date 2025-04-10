package com.films.tvshow.repository

import com.films.tvshow.entity.TVShow
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface TVShowRepository : ReactiveCrudRepository<TVShow, Long> {

}