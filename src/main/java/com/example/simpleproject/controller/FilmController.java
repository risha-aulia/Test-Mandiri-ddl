package com.example.simpleproject.controller;

import com.example.simpleproject.entity.Film;
import com.example.simpleproject.service.FilmService;
import com.example.simpleproject.utils.ApiUrlConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiUrlConstant.FILM_PATH)
public class FilmController {
    FilmService filmService;
    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }
    @PostMapping
    public Film saveFilm(Film film){
        return filmService.saveFilm(film);
    }
    @PutMapping
    public Film updateFilm(@RequestBody Film film){
        return filmService.updateFilm(film);
    }
    @GetMapping("/list")
    public List<Film> getAllFilm(){
        return filmService.getAllFilm();
    }
    @GetMapping
    public Film getFilmByID(@PathVariable String id){
        return filmService.getFilmById(id);
    }
    @DeleteMapping
    public void deleteFilm(@PathVariable String id){
        filmService.deleteFilm(id);
    }
}
