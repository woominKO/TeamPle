package com.example.TeamPle.dto;

import com.example.TeamPle.domain.Room;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class RoomResponseDto {
    private UUID roomId;
    private LocalDateTime createdAt;
    private int userCount;

    public RoomResponseDto(Room room) {
        this.roomId = room.getRoomId();
        this.createdAt = room.getCreatedAt();
        this.userCount = room.getUserList().size();
    }
}