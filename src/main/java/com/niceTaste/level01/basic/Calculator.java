package com.niceTaste.level01.basic;

public class Calculator {
    void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    int sum1to10() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    void checkMaxNumber(int a, int b) {
        if(a > b) System.out.println("두 수 중 큰 수는 " + a + "이다.");
        else System.out.println("두 수 중 큰 수는 " + b + "이다.");
    }

    int sumTwoNumber(int a, int b) {
        return a + b;
    }

    int minusTwoNumber(int a, int b) {
        return a - b;
    }
}
