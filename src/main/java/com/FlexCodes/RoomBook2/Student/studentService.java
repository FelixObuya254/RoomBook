package com.FlexCodes.RoomBook2.Student;

import java.util.List;
import java.util.Optional;

public interface studentService {
    void createStudent(student student);
    List<student>listAll();
    void deleteStudent(Long Id);
    Optional<student> findById(Long Id);
    student findByRegNo(String RegNo);


}
