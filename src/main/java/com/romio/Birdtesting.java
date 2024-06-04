package com.romio;

public class Birdtesting {
    public static void main(String[] args) {
        Bird duckBird= new Duck();
        Bird parrot= new Parrot();
        Bird pigeon= new pigeon();

        duckBird.walk();
        duckBird.speak();
        duckBird.fly();

        System.out.println("------------");
        parrot.walk();
        parrot.speak();
        parrot.fly();
        // parrot.sayMyName("Romio");

        System.out.println("------------");
        pigeon.walk();
        pigeon.speak();
        pigeon.fly();

    }
}
