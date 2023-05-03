package com.niceTaste.level01.basic;

public class Calculator {
    void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    int sum1to10() {
        int sum = 0;
        for(int i = 1; i < 11; i++) {
            sum += i;
        }
        return sum;
    }

    void checkMaxNumber(int a, int b) {
        int MaxNumber = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 " + MaxNumber +"이다");
    }

    int sumTwoNumber(int a, int b) {
        System.out.println(a + "과" + b + "의 합은 : " + (a + b));
        return (a + b);
    }

    int minusTwoNumber(int a, int b) {
        System.out.println(a + "과 " + b + "의 차는 : " + (a - b));
        return (a - b);
    }
}
