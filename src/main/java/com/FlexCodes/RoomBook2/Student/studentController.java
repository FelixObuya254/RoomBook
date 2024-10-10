package com.FlexCodes.RoomBook2.Student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class studentController {
private final studentService studentService;

    public studentController(com.FlexCodes.RoomBook2.Student.studentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/postStu")
   public ResponseEntity<String> postStudent(@RequestBody student student){
        studentService.createStudent(student);
        return new ResponseEntity<>( "student successfully added", HttpStatus.OK);
    }
    @GetMapping("/student/{RegNo}")
        public ResponseEntity<student>getstudent(@PathVariable String RegNo){
        student student=studentService.findByRegNo(RegNo);
        if(student!=null)
            return new  ResponseEntity<>(student, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
    @GetMapping("/Students")
    public ResponseEntity<List<student>>AllStudents(@PathVariable student student){
        return new ResponseEntity<>(studentService.listAll(),HttpStatus.OK);
    }
    @PutMapping("/{Id}")
    public ResponseEntity<String>UpdateHostel(@PathVariable Long Id, @RequestBody student Updated){
        boolean updated=studentService.UpdateStudent(Id,Updated);
        if(updated)
            return new ResponseEntity<>("Student updated successfully",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/student/{Id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        boolean Deleted = studentService.deleteById(id);
        if (Deleted)
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }


}
