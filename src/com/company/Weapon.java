package com.company;
import java.util.Random;

public class Weapon extends Item{

    public int lvl;
    public int AD;
    public int bag;
    public double AS;
    Weapon(String name, int lvl, int AD, int AS){
        this.lvl = lvl;
        this.AD = AD;
        this.AS = AS;
        this.name = name;
        bag = 3;
    }
}
