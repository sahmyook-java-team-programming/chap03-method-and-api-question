package com.niceTaste.level02.normal;
public class Application1 {
    public static void main(String[] args) {
        RandomMaker rM = new RandomMaker();
        rM.randomNumber(-40, 32);
        rM.randomUpperAlpabet(10);
        rM.rockPaperScicssors();
        rM.tossCoin();
    }
}
