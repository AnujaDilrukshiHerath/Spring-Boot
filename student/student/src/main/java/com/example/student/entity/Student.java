package com.example.student.entity;
import lombok.*;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name="studentName")
    private String studentName;


    @OneToMany(cascade = {CascadeType.ALL})
    private List<ClassRoom> classRoomList;

}
