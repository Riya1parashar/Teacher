package com.User.service;

import com.User.entities.TeacherRecord;
import com.User.repository.TeacherRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherRecordService {
    @Autowired
    private TeacherRecordRepo teacherRecordRepo;
    //create
    public TeacherRecord createTeacher(TeacherRecord saveData){
        TeacherRecord teacherData = new TeacherRecord();
        teacherData.setTName(saveData.getTName());
        teacherData.setMobileNumber(saveData.getMobileNumber());
        TeacherRecord dataSaved = this.teacherRecordRepo.save(teacherData);
        return dataSaved;

    }
    //read
    public TeacherRecord teacherById(int tId){
        TeacherRecord teacherData = this.teacherRecordRepo.findById(tId).get();
        return teacherData;
    }
    //update
    public TeacherRecord  updateTeacher (int tId, TeacherRecord dataUpdate) {

        TeacherRecord data = this.teacherRecordRepo.findById(tId).get();

        TeacherRecord newData = new TeacherRecord();

        if (data.getTName() != null) {

            newData.setTId(tId);

            newData.setTName(dataUpdate.getTName());

            newData.setMobileNumber(dataUpdate.getMobileNumber());
            this.teacherRecordRepo.save(newData);

        } else {

            System.out.println("User with user id: " + tId + " not found");

        }

        return newData;
    }
    //delete
    public void deleteTeacher(int tId){
        this.teacherRecordRepo.deleteById(tId);
    }
}
