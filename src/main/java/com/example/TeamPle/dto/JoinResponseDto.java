package com.example.TeamPle.dto;

import lombok.Getter;
import java.util.UUID;

@Getter
public class JoinResponseDto {
    private Long userId;
    private String nickname;
    private UUID roomId;

    public JoinResponseDto(Long userId, String nickname, UUID roomId) {
        this.userId = userId;
        this.nickname = nickname;
        this.roomId = roomId;
    }
}
