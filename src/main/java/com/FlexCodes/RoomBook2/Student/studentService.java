package com.FlexCodes.RoomBook2.Student;

import java.util.List;
import java.util.Optional;

public interface studentService {
    void createStudent(student student);
    List<student>listAll();
    boolean deleteById(Long id);
    Optional<student> findById(Long id);
    student findByRegNo(String RegNo);
    boolean UpdateStudent(Long Id, student Updated);


}
