package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String OwnerName;

    public Farm() {

    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm : " +
                "address = " + address +
                "\n\t\t\t cows  " + Arrays.toString(cows) +
                "\n\t\t\t horses " + Arrays.toString(horses) +
                "\n\t\t\t sheep  " + Arrays.toString(sheep) +
                "\n\t\t\t OwnerName = " + OwnerName +
                '\n';
    }
}
