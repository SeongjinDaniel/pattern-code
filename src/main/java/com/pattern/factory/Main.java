package com.pattern.factory;


enum CoffeeType {
    LATTE,
    ESPRESSO
}

abstract class Coffee {
    protected String name;

    public String getName() {
        return name;
    }
}

class Latte extends Coffee {
    public Latte() {
        name = "Latte";
    }
}

class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
    }
}

class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType type) {
        return switch (type) {
            case LATTE -> new Latte();
            case ESPRESSO -> new Espresso();
            default -> throw new IllegalArgumentException("Invalid coffee type: " + type);
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.createCoffee(CoffeeType.LATTE);
        System.out.println(latte.getName());

        Coffee espresso = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        System.out.println(espresso.getName());
    }
}
