package com.example.TeamPle;

import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
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
}

