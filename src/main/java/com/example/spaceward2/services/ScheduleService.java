package com.example.spaceward2.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.spaceward2.models.Schedule;
import com.example.spaceward2.repository.ScheduleRepository;

@Service
public class ScheduleService {

    private final ScheduleRepository repository;

    public ScheduleService(final ScheduleRepository repository) {
        this.repository = repository;
    }

    public Page<Schedule> getSchedules(final int pageNumber, final int size) {
        return repository.findAll(PageRequest.of(pageNumber, size));
    }

    public Optional<Schedule> getSchedule(final int id) {
        return repository.findById(id);
    }

    public Schedule saveSchedule(final Schedule schedule) {
        return repository.save(schedule);
    }
}
