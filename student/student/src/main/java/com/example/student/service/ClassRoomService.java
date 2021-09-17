package com.example.student.service;

import com.example.student.dao.ClassRoomDao;
import com.example.student.dto.ClassRoomDto;
import com.example.student.dto.StudentDto;
import com.example.student.entity.ClassRoom;
import com.example.student.entity.Student;
import javassist.NotFoundException;

import java.util.List;

public interface ClassRoomService {
    public void addClassRoom(ClassRoomDto classRoomDto);
    public List<ClassRoomDto> getAllClassRoom();
    public void deleteClassRoom(Integer id);
    ClassRoom updateClass(ClassRoomDto classRoomDto );

}
