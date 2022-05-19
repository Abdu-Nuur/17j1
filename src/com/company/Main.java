package com.company;

public class Main {

    public static void main(String[] args) {

        Farm farm1 = new Farm("Vastok", new Cow[]{
                new Cow(114, (byte) 6, "Kyz", "Uy1"),
                new Cow(94, (byte) 3, "Erkek", "Uy2"),
                new Cow(145, (byte) 7, "Erkek", "Uy3"),
                new Cow(97, (byte) 4, "Kyz", "Uy4"),
                new Cow(109, (byte) 8, "Kyz", "Uy5")},
                new Horse[]{
                        new Horse(112, (byte) 6, "Kuron", "Kyz", "At1"),
                        new Horse(137, (byte) 7, "Kara", "Erkek", "At2"),},
                new Sheep[]{
                        new Sheep(63, (byte) 4, "Kyz", "Koy1"),
                        new Sheep(72, (byte) 6, "Kyz", "Koy2"),
                        new Sheep(78, (byte) 6, "Erkek", "Koy3")},
                "Abdu-Nuur");

        Farm farm2 = new Farm("Lebedinovka", new Cow[]{
                new Cow(97, (byte) 4, "Kyz", "Uy4")},
                new Horse[]{
                        new Horse(112, (byte) 6, "Kuron", "Kyz", "At1")},
                new Sheep[]{
                        new Sheep(78, (byte) 6, "Erkek", "Koy3")},
                "Mansur");

        System.out.println("1 " + farm1);
        System.out.println("2 " + farm2);


    }

}
