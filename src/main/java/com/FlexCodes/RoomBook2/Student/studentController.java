package com.FlexCodes.RoomBook2.Student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class studentController {
private final studentService studentService;

    public studentController(com.FlexCodes.RoomBook2.Student.studentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/Add")
   public String postStudent(@RequestBody student student){
        studentService.createStudent(student);
        return "student successfully added";
    }
    @GetMapping("/student/RegNo")
    List<student>studentList(@PathVariable String RegNo){
        student student =studentService.findByRegNo(RegNo);
        return (List<com.FlexCodes.RoomBook2.Student.student>) student;
    }

}
