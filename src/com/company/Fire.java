package com.company;
import java.util.Random;

public class Fire extends Magic implements MagicLogic{
    Fire(){
        id = 1;
        dmg = 5;
        name = "Огонь";
    }
    public int spellCast1(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Игни!\n");
        total = (int)(dmg * (hero.lvl/5 + 1.5) *9);
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " поджаривается пламенем в течении 9 сеунд, всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast2(Hero hero, Enemy enemy){
        Random random = new Random();
        int total = 0;
        System.out.print(hero.name + " использует Огненный шар!\n");
        total = (int)(dmg * (random.nextInt(15) * (hero.lvl/5 + 1)));
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " принимает огненный шар, всего получает " + total + " урона!\n");
        return total;
    }
    public int spellCast3(Hero hero, Enemy enemy){
        int total = 0;
        System.out.print(hero.name + " использует Рассекающую лагуну!\n");
        total = (int)(50 * (hero.lvl/10 + 1) );
        enemy.HP = enemy.HP - total;
        System.out.print( enemy.name + " прожжен лагуной, всего получает " + total + " урона!\n");
        return total;
    }
}
