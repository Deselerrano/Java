package com.company;
import java.util.Random;

public class Ether extends Magic implements MagicLogic{
    Ether(){
        id = 6;
        dmg = 1;
        name = "Эфир";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Животочащий воск!\n");
        Random random = new Random();
        total = (int)((random.nextInt(5)+ 1) * (hero.lvl/10 + 1) * (random.nextInt(10) + 5));
        enemy.HP = enemy.HP - total;
        System.out.print("Чудеса " + enemy.name + " начинает плавится словно воск, всего получает " + total + " урона!\n");
        return total;
    }
    public  int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Блекхол!\n");
        total = (int)(random.nextInt(80)* (hero.lvl/20 + 1));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " поглощен дырой получает " + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Машино заклинае!\n");
        total = random.nextInt(150);
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " всего получает " + total + " урона!\n");
        return total;
    }
}
