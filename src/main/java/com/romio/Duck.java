package com.romio;

public class Duck extends Base{
    @Override
    public void walk() {
        System.out.println("duck step");

    }

    @Override
    public void speak() {
        System.out.println("duck quak-quak");

    }
}
