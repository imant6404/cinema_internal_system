package com.example.course_work_cinema.service;import com.example.course_work_cinema.entity.Hall;import com.example.course_work_cinema.entity.Movie;import java.util.List;import java.util.Optional;public interface MovieService {    List<Movie> findAll();    void save(Movie movie);    Optional<Movie> findById(Integer integer);    void deleteById(Integer integer);    Integer getMovieIdByTitle(String movieTitle);}