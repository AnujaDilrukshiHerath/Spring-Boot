package com.example.student.service.imple;

import com.example.student.dao.ClassRoomDao;
import com.example.student.dto.ClassRoomDto;
import com.example.student.dto.StudentDto;
import com.example.student.entity.ClassRoom;
import com.example.student.entity.Student;
import com.example.student.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassRoomImpl implements ClassRoomService {

    private final ClassRoomDao classRoomDao;

    @Autowired
    public ClassRoomImpl(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }


    public void addClassRoom(ClassRoomDto classRoomDto) {
        ClassRoom classRoom=new ClassRoom();
        Student student=new Student();
        classRoom.setClassRoomId(classRoomDto.getClassRoomId());
        classRoom.setClassRoomName(classRoomDto.getClassRoomName());
        classRoom.setNumberOfStudents(classRoomDto.getNumberOfStudent());
        classRoom.setStudent(student);
        classRoomDao.save(classRoom);

    }


    public List<ClassRoomDto> getAllClassRoom() {
        List<ClassRoom> classRoomList = classRoomDao.findAll();
        return   classRoomList.stream().map(classRoom -> {
            ClassRoomDto classRoomDto=new ClassRoomDto();
            classRoomDto.setClassRoomId(classRoom.getClassRoomId());
            classRoomDto.setClassRoomName(classRoom.getClassRoomName());
            classRoomDto.setNumberOfStudent(classRoom.getNumberOfStudents());
            classRoomDto.setStudentId(classRoom.getStudent().getStudentId());
            return classRoomDto;
        }).collect(Collectors.toList());
    }

    public ClassRoom updateClass(ClassRoomDto classRoomDto) {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassRoomId(classRoom.getClassRoomId());
        classRoom.setClassRoomName(classRoom.getClassRoomName());
        classRoom.setNumberOfStudents(classRoom.getNumberOfStudents());

        Student student=new Student();
        student.setStudentId(1);
        classRoomDao.save(classRoom);
        return classRoom;
    }


    public void deleteClassRoom(Integer id) {
        Optional<ClassRoom> byId = classRoomDao.findById(id);
        if (byId.isPresent()){
            classRoomDao.delete(byId.get());
        }
    }
}
