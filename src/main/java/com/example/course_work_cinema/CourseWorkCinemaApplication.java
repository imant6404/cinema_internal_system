package com.example.course_work_cinema;

import com.example.course_work_cinema.dao.HallRepository;
import com.example.course_work_cinema.dao.MovieRepository;
import com.example.course_work_cinema.entity.Hall;
import com.example.course_work_cinema.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class CourseWorkCinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseWorkCinemaApplication.class, args);
    }

}
