package com.example.spaceward2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spaceward2.models.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}
