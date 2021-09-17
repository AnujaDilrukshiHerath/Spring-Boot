package com.example.student.entity;
import lombok.*;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classRoom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_room_id")
    private Integer classRoomId;
    @Column(name = "class_room_name")
    private String classRoomName;
    @Column(name = "number_of_students")
    private Integer numberOfStudents;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "student_id_FK",referencedColumnName = "student_id" )
    private Student student;



}
