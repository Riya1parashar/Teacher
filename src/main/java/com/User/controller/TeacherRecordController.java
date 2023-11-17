package com.User.controller;

import com.User.entities.TeacherRecord;
import com.User.service.TeacherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Teacher")
@CrossOrigin("*")
public class TeacherRecordController {
    @Autowired
    private TeacherRecordService teacherRecordService;
    //create
   @PostMapping("/create")

    public TeacherRecord createTeacher (@RequestBody TeacherRecord teacherRecord){

        return this.teacherRecordService.createTeacher(teacherRecord);

    }

//read

   @GetMapping("/getTeacher/{tId}")

    public TeacherRecord getCustomerById(@PathVariable Integer tId) {

        return this.teacherRecordService.teacherById(tId);

    }

//update

    @PutMapping("/update/(tId}")

    public TeacherRecord updateTeacherRecord (@PathVariable Integer tId, @RequestBody TeacherRecord teacherRecord){

        return this.teacherRecordService.updateTeacher (tId, teacherRecord);

    }

//delete

   @DeleteMapping("/delete/{tId}")
    public String deleteTeacher(@PathVariable int tId){
       return this.teacherRecordService.deleteTeacher(tId);


    }
}
