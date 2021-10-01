package com.company;

import java.util.Random;

public class Water extends Magic implements MagicLogic{
    Water(){
        id = 2;
        dmg = 45;
        name = "Вода";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Гейзер!\n");
        total = (int)(dmg * (hero.lvl/20 + 1));
        enemy.HP = enemy.HP - total;
        System.out.print("На " + enemy.name + " обрушен шквал воды, всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Поток!\n");
        total = (int)(1 * (random.nextInt(45) * (hero.lvl/20 + 1)));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " поглащен водой получив " + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Истощение!\n");
        total = (int)( 15 * 3 * (hero.lvl/20 + 1) );
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " задыхается , всего получает " + total + " урона!\n");
        return total;
    }
}
