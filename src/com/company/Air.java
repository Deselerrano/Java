package com.company;

import java.util.Random;

public class Air extends Magic implements MagicLogic{
    Air(){
        id = 4;
        dmg = 25;
        name = "Воздух";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Торнадо!\n");
        total = (int)(dmg * (hero.lvl/10 + 1) *(2 + ((int)(hero.lvl/5))));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " таранят " + (2 + ((int)(hero.lvl/5))) + " торнадо , всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Обдув!\n");
        total = (int)(2 * ((random.nextInt(25)+20) * (hero.lvl/10 + 1)));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " захлестнул воздух тотал" + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Аард!\n");
        total = (int)( 80 / (hero.lvl/15 + 1) );
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " сбит с ног  всего получив" + total + " урона!\n");
        return total;
    }
}
