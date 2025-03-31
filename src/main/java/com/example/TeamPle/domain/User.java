package com.example.TeamPle.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
public class User {

    // getter/setter (Lombok 쓰지 않을 경우 수동 생성)
    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @ManyToMany(mappedBy = "userList")
    private Set<Room> rooms;  // 유저가 속한 방 목록

    // 기본 생성자
    public User() {
    }

}
