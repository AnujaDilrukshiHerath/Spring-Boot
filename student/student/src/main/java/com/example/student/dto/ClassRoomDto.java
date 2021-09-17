package com.example.student.dto;

import com.example.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoomDto {
    private Integer classRoomId;
    private String classRoomName;
    private Integer numberOfStudent;
    private Integer studentId;
}
