package com.company;

public class Horse extends Animal {

    private String color;

    public Horse(int weight, int age, String color, String gender, String nickName) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                " color = " + color;
    }


}
