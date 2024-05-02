package com.driver;

// F1 class, inheriting from Car
public class F1 extends Car {
    private String team;

    public F1(String name, int numDoors, String team) {
        super(name, numDoors);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
