package com.User.repository;

import com.User.entities.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRecordRepo extends JpaRepository<TeacherRecord ,Integer> {
}
