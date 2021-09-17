package com.example.student.service.imple;

import com.example.student.dao.StudentDao;
import com.example.student.dto.StudentDto;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    public StudentImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    public StudentDto getStudent(int studentId) throws NotFoundException {
        Optional<Student> student = studentDao.findById(studentId);
        if (!student.isPresent()) {
            throw new NotFoundException("Student not found!");
        }
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(student.get().getStudentId());
        studentDto.setStudentName(student.get().getStudentName());
        return studentDto;

    }

    public String addStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        studentDao.save(student);
        return "Successfully saved the student";
    }



    public Student updateStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentId(student.getStudentId());
        studentDao.save(student);
        return student;
    }

    public void deleteStudent(Integer studentId) {
        Optional<Student> student=studentDao.findById(studentId);
        if(student.isPresent()){
            studentDao.delete(student.get());
        }
    }
}
