package com.example.TeamPle;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.example.TeamPle.User;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.UUID;
import java.util.Set;

@Setter
@Getter
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roomId;

    private LocalDateTime createdAt;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<User> userList;


    // 기본 생성자
    public Room() {
        this.createdAt = LocalDateTime.now();  // 생성 시간 자동으로 현재 시간
        this.userList = new HashSet<>();  // 초기화 추가!
    }


}
