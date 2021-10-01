package com.company;
import java.util.Random;

public class Enemy extends Creature {
    public int HP;
    public int lvl;
    public int AD;
    public int armor;
    public double AS;
    public int haveWeapon;
    Weapon weapon;
    Enemy(){
        haveWeapon = 0;
        Random random = new Random();
        name = Names.namesEnemy.get(random.nextInt(10));
        lvl = 1 + random.nextInt(5);
        HP = (int)((random.nextInt(50) + 30)*(lvl/10 + 1));
        AD = (int)((random.nextInt(20) + 10)*(lvl/10 + 1));
        armor = (int)((random.nextInt(10) + 15)*(lvl/10 + 1));
        AS = (int)((random.nextInt(15)/10 + 1)*(lvl/10 + 1));
        haveWeapon = 0;
        bag = 10;
        id = random.nextInt(999);
    }
}
