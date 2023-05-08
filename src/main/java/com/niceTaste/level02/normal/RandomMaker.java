package com.niceTaste.level02.normal;
import java.lang.Math;
import java.util.Random;
public class RandomMaker {
    int randomNumber(int min, int max) {
        int num = max - min + 1;
        int random = (int)(Math.random() * num) + min;
        System.out.println(random);
        return random;
    }
    String randomUpperAlpabet(int length) {
        String str = "";
        Random random = new Random();
        for(int i = 0; i < length; i++) {
            int num = random.nextInt(26) + 65;
            str += (char)num;
        }
        System.out.println(str);
        return str;
    }
    String rockPaperScicssors() {
        String[] str = {"가위", "바위", "보"};
        Random random = new Random();
        int num = random.nextInt(3);
        System.out.println(str[num]);
        return str[num];
    }
    String tossCoin() {
        String[] str = {"앞면", "뒷면"};
        Random random = new Random();
        int num = random.nextInt(2);
        System.out.println(str[num]);
        return str[num];
    }
}
