package com.example.TeamPle;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    // ✅ 방 생성
    public Room createRoom() {
        Room room = new Room(); // 생성자에서 createdAt 자동 설정됨
        return roomRepository.save(room);
    }

    // ✅ 유저 방 입장
    public JoinResponseDto joinRoom(UUID roomId) {
        // 1. 방 찾기
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 방입니다."));

        // 2. 닉네임 랜덤 생성
        String nickname = NicknameGenerator.generate();

        // 3. 유저 생성 및 저장
        User user = new User();
        user.setNickname(nickname);
        User savedUser = userRepository.save(user);

        // 4. 방에 유저 추가
        room.getUserList().add(savedUser);
        roomRepository.save(room);

        // 5. 응답 DTO 생성
        return new JoinResponseDto(savedUser.getId(), savedUser.getNickname(), room.getRoomId());
    }
}
