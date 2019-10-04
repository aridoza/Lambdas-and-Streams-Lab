package com.ga;

public class Lion extends Cat {
    @Override
    public int getLives() {
        return 1;
    }
    @Override
    public String favoriteSnack() {
        return "Gazelles";
    }

    public void roar() {
        System.out.println("Rowr!");
    }
}
