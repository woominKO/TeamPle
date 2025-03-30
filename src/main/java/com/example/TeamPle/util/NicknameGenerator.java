package com.example.TeamPle.util;

import java.util.Random;

public class NicknameGenerator {

    private static final String[] ADJECTIVES = {"익명의", "조용한", "활발한", "느긋한"};
    private static final String[] ANIMALS = {"고양이", "호랑이", "너구리", "기린", "고래"};

    public static String generate() {
        Random random = new Random();
        String adj = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String animal = ANIMALS[random.nextInt(ANIMALS.length)];
        int number = random.nextInt(900) + 100; // 100 ~ 999
        return adj + " " + animal + number;
    }
}
