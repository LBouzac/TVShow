package com.films.tvshow.service

import com.films.tvshow.entity.TVShow
import com.films.tvshow.repository.TVShowRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class TVShowService(val tvShowRepository: TVShowRepository) {
    fun getAllTVShows(): Flux<TVShow> = tvShowRepository.findAll()

    fun getTVShowById(id: Long): Flux<TVShow> = tvShowRepository.findById(id)
        .flatMapMany { tvShow ->
            Flux.just(tvShow)
        }
        .switchIfEmpty(Flux.error(RuntimeException("TV Show not found, try another ID: $id")))
}