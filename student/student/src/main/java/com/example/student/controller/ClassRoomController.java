package com.example.student.controller;

import com.example.student.dto.ClassRoomDto;

import com.example.student.dto.StudentDto;
import com.example.student.entity.ClassRoom;
import com.example.student.service.imple.ClassRoomImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/classRoom")
public class ClassRoomController {

    @Autowired
            private ClassRoomImpl classRoomImpl;

    @Autowired
    public ClassRoomController(ClassRoomImpl classRoomImpl) {
        this.classRoomImpl = classRoomImpl;
    }




    @PostMapping("/addClass")
    public void addClass(@RequestBody ClassRoomDto classRoomDto){
        classRoomImpl.addClassRoom(classRoomDto);
    }

    @GetMapping
    public List<ClassRoomDto> getAll(){
        return classRoomImpl.getAllClassRoom();
    }


    @PutMapping()
    public ClassRoom updateClass(@RequestBody ClassRoomDto classRoomDto) {
        ClassRoom classRoom= classRoomImpl.updateClass(classRoomDto);
        return classRoom;
    }

    @DeleteMapping("/{id}")
    public void deleteClassRoom(@PathVariable Integer id){
        classRoomImpl.deleteClassRoom(id);
    }


}
