package com.FlexCodes.RoomBook2.Student;

import java.util.List;

public interface studentService {
    void createStudent(student student);

    void createStudent();
    List<student>listAll();
    void deleteStudent(Long Id);
    student findById(Long Id);
    student findByRegNo(String RegNo);


}
