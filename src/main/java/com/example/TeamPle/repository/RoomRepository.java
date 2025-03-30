package com.example.TeamPle.repository;

import com.example.TeamPle.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<Room, UUID>{

}