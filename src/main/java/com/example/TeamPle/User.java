package com.example.TeamPle;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @ManyToMany(mappedBy = "userList")
    private Set<Room> rooms;  // 유저가 속한 방 목록

    // 기본 생성자
    public User() {
    }

    // getter/setter (Lombok 쓰지 않을 경우 수동 생성)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
