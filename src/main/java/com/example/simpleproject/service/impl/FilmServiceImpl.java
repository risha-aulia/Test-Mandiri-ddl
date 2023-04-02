package com.example.simpleproject.service.impl;

import com.example.simpleproject.entity.Film;
import com.example.simpleproject.repository.FilmRepository;
import com.example.simpleproject.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    FilmRepository filmRepository;

    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }

    @Override
    public Film getFilmById(String id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public void deleteFilm(String id) {
        filmRepository.deleteById(id);

    }
}
