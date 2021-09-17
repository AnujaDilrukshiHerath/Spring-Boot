package com.example.student.dao;

import com.example.student.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomDao extends JpaRepository<ClassRoom,Integer> {
}
