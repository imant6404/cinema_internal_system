package com.example.course_work_cinema.service;import com.example.course_work_cinema.dao.HallRepository;import com.example.course_work_cinema.entity.Hall;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.util.List;import java.util.Optional;@Servicepublic class HallServiceImpl implements HallService {    @Autowired    private HallRepository hallRepository;    @Override    public List<Hall> findAll() {        return hallRepository.findAll();    }    @Override    public void save(Hall hall) {        hallRepository.save(hall);    }    @Override    public Optional<Hall> findById(Integer integer) {        return hallRepository.findById(integer);    }    @Override    public void deleteById(Integer integer) {        hallRepository.deleteById(integer);    }}