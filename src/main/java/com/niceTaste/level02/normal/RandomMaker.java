package com.niceTaste.level02.normal;

import java.util.Random;

import static java.lang.Math.random;

public class RandomMaker {
    int randomNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max) + min;

        return randomNumber;
    }

    String randomUpperAlpabet(int length) {
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            Random random = new Random();
            int randomStr = 65 + (int) (random.nextInt(90-65+1));
            sb.append((char) (randomStr));
        }
        String str = sb.toString().toUpperCase();
        return str;
    }

    String rockPaperScissors(){
        Random random = new Random();
        int hand = random.nextInt(2);
        String game = "";
        if (hand == 0) {
            game = "가위";
        } else if (hand == 1) {
            game = "바위";
        } else {
            game = "보";
        }

        return game;
    }

    String tossCoin(){
        String toss = "";
        Random random = new Random();
        int coin = random.nextInt(2);
        if (coin == 0) {
            toss = "앞면";
        }else {
            toss = "뒷면";
        }

        return toss;
    }
}
