package com.films.tvshow

import com.films.tvshow.entity.TVShow
import com.films.tvshow.service.TVShowService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/tvshows")
class TVShowController(var tvShowService: TVShowService) {

    //http://localhost:8080/api/tvshows
    @GetMapping
    fun getAllTVShows() : Flux<TVShow> = tvShowService.getAllTVShows()

    //http://localhost:8080/api/tvshows/1
    @GetMapping("/{id}")
    fun getTVShowById(@PathVariable id: String) : Flux<TVShow> = tvShowService.getTVShowById(id.toLong())
}