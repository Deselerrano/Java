package com.company;

public abstract class Magic {
    public int id;
    public int bag;
    public int dmg;
    public String name;
    Magic(){
        bag = 3;
    }
    int spellCast1(Hero hero, Enemy enemy){
        return 0;
    };
    int spellCast2(Hero hero, Enemy enemy){
        return 0;
    };
    int spellCast3(Hero hero, Enemy enemy){
        return 0;
    };
}
