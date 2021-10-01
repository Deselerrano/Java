package com.company;

import java.util.Random;

public class Frost extends Magic implements MagicLogic{
    Frost(){
       id = 3;
       dmg = 1;
        name = "Холод";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Снежную бурю!\n");
        total = (int)(dmg * (hero.lvl/10 + 1) *(40 + hero.lvl));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " пронзают " + (40 + hero.lvl) + " снежинок , всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует сосулька!\n");
        total = (int)(1 * (random.nextInt(45) * (hero.lvl/10 + 1)));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " словил сосульку " + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Заморозка!\n");
        total = (int)( 18 * 3 * (hero.lvl/20 + 1) );
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " замерз получив " + total + " урона!\n");
        return total;
    }
}
