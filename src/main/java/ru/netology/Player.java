package ru.netology;

public class Player {
    protected int id;
    protected String name;
    protected int strenght;

    public int getStrenght() {
        return strenght;
    }

    public String getName() {
        return name;
    }

    public Player(String name, int id, int strenght) {
        this.name = name;
        this.id = id;
        this.strenght = strenght;
    }
}
