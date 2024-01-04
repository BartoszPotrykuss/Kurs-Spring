package com.dailycodebuffer.springdata.jpa.tutorial.repository;

import com.dailycodebuffer.springdata.jpa.tutorial.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
