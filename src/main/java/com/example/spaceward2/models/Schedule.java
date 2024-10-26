package com.example.spaceward2.models;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "grade")
    private float grade;
    @Column(name = "teacher_name")
    private String teacherName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
