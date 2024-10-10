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
    public boolean deleteById(Long id) {
        try{
            studentRepo.deleteById(id);
            return true;
        }

        catch (Exception e){
            return false;

        }


    }


    @Override
    public Optional<student> findById(Long Id) {
       return  studentRepo.findById(Id);
        }

    @Override
    public student findByRegNo(String RegNo) {
        return null;
    }

    @Override
    public boolean UpdateStudent(Long Id, student Updated) {
        Optional<student>studentOptional=studentRepo.findById(Id);
        if(studentOptional.isPresent()){
            student student=studentOptional.get();
            student.setFirstname(Updated.getFirstname());
            student.setLastName(Updated.getLastName());
            student.setEmail(Updated.getEmail());
            student.setPhoneNo(Updated.getPhoneNo());
            student.setRegNo(Updated.getRegNo());
            studentRepo.save(student);
        }
        return false;
    }


}
