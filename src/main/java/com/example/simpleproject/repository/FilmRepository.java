package com.example.simpleproject.repository;

import com.example.simpleproject.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, String> {

}
