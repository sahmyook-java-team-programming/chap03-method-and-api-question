package com.niceTaste.level02.normal;public class Application1 {
    public static void main(String[] args) {
        RandomMaker rM = new RandomMaker();
        System.out.println(rM.randomNumber(-35,10));
        System.out.println(rM.randomUpperAlpabet(7));
        System.out.println(rM.rockPaperScissors());
        System.out.println(rM.tossCoin());
    }
}
