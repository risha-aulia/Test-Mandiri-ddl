package com.example.simpleproject.service;

import com.example.simpleproject.entity.Film;

import java.util.List;

public interface FilmService {
    Film saveFilm(Film film);
    Film updateFilm(Film film);
    List<Film> getAllFilm();
    Film getFilmById(String id);
    void deleteFilm(String id);
}
