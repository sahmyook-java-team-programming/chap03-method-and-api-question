package com.niceTaste.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethod();
        System.out.println("1부터 10까지의 합 : " + cal.sum1to10());
        cal.checkMaxNumber(10, 20);
        System.out.println("10과 20의 합은 : " + cal.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차는 : " + cal.minusTwoNumber(10, 5));
    }
}
