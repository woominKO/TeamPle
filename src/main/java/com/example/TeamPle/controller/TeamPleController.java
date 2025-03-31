package com.example.TeamPle.controller;

import com.example.TeamPle.dto.JoinResponseDto;
import com.example.TeamPle.domain.Room;
import com.example.TeamPle.dto.RoomResponseDto;
import com.example.TeamPle.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rooms")
public class TeamPleController {

    private final RoomService roomService;

    public TeamPleController(RoomService roomService) {
        this.roomService = roomService;
    }

    // ✅ 방 생성
    @PostMapping
    public Room createRoom() {
        return roomService.createRoom();
    }

    // ✅ 유저 방 입장
    @PostMapping("/{roomId}/join")
    public JoinResponseDto joinRoom(@PathVariable UUID roomId) {
        return roomService.joinRoom(roomId);
    }

    @GetMapping
    public List<RoomResponseDto> getAllRooms() {
        return roomService.getAllRooms();
    }
}

