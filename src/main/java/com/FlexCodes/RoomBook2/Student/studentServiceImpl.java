package com.FlexCodes.RoomBook2.Student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class studentServiceImpl implements studentService{
    private studentRepo studentRepo;

    public studentServiceImpl(com.FlexCodes.RoomBook2.Student.studentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
   // private final List<student>students=new ArrayList<>();

    @Override
    public void createStudent(student student) {
    studentRepo.save(student);
    }


    @Override
    public List<student> listAll() {
       return studentRepo.findAll();
    }

    @Override
    public void deleteStudent(Long Id) {

    }


    @Override
    public Optional<student> findById(Long Id) {
       return  studentRepo.findById(Id);
        }

    @Override
    public student findByRegNo(String RegNo) {
        return null;
    }


}
