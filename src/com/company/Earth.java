package com.company;

import java.util.Random;

public class Earth extends Magic implements MagicLogic{
    Earth(){
        id = 5;
        dmg = 11;
        name = "Земля";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Силу земли\n");
        total = (int)(dmg * (-hero.lvl/10 + 1.5) * 4);
        enemy.HP = enemy.HP - total;
        System.out.print("Под " + enemy.name + " дребезжит земля, всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Травку!\n");
        total = (int)(dmg * 8  / (hero.lvl/5 + 1));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " зарастает травой " + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Зыбучую землю!\n");
        total = (int)(random.nextInt(100));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " земля дребизжит под ногами " + total + " урона!\n");
        return total;
    }
}
