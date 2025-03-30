package com.example.TeamPle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    @ManyToMany(mappedBy = "userList")
    private Set<Room> rooms;  // 유저가 속한 방 목록
}
