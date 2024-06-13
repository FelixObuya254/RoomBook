package com.FlexCodes.RoomBook2.Student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class studentServiceImpl implements studentService{
    private studentRepo studentRepo;

    public studentServiceImpl(com.FlexCodes.RoomBook2.Student.studentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    private final List<student>students=new ArrayList<>();

    @Override
    public void createStudent(student student) {
    students.add((com.FlexCodes.RoomBook2.Student.student) students);
    }

    @Override
    public void createStudent() {

    }

    @Override
    public List<student> listAll() {
       return students;
    }

    @Override
    public void deleteStudent(Long Id) {

    }

    @Override
    public student findById(Long Id) {
        return null;
    }

    @Override
    public student findByRegNo(String RegNo) {
        for (student student : students) {
            if (student.getRegNo().equals(RegNo))
                return student;
        }
        return null;
    }
}
