package com.company;
import java.util.Random;

public class GameLogic {
    public static void AttackHero(Hero hero,  Enemy enemy){
        enemy.HP = enemy.HP - DPSHero(hero)/ (enemy.armor/5);
    }
    public static void AttackedByEnemy(Hero hero,  Enemy enemy){
        hero.HP = hero.HP - DPSEnemy(enemy)/(hero.armor/5);
    }
    public static void EquipWeaponHero(Hero hero, Weapon weapon){
        hero.weapon = weapon;
        hero.haveWeapon = 1;
        hero.bag = hero.bag - weapon.bag;
    }
    public static void EquipWeaponEnemy(Enemy enemy, Weapon weapon){
        enemy.weapon = weapon;
        enemy.haveWeapon = 1;
        enemy.bag = enemy.bag - weapon.bag;
    }
    public static int DPSHero(Hero hero){
        int DPS;
        if (hero.haveWeapon ==1){
            DPS = (int)((hero.AD + hero.weapon.AD)*(hero.AS * hero.weapon.AS)) ;
        }else{
            DPS = (int)((hero.AD)*(hero.AS));
        }
        return DPS;
    }
    public static int DPSEnemy(Enemy enemy){
        int DPS;
        if (enemy.haveWeapon ==1){
            DPS = (int)((enemy.AD + enemy.weapon.AD)*(enemy.AS * enemy.weapon.AS)) ;
        }else{
            DPS = (int)((enemy.AD)*(enemy.AS));
        }
        return DPS;
    }
    public static void Fight(Hero hero, Enemy enemy){
        Random random = new Random();
        while((hero.HP >= 0)&&(enemy.HP >=0)){
            int rand = random.nextInt(3);
            if (rand ==0){
                AttackHero(hero,enemy);
                System.out.print(enemy.name +  " получает " + DPSHero(hero) + " урона от атаки " + hero.name +"\nУ него осталось " + enemy.HP + " здоровья!\n");
            }else if (rand ==1){
                AttackedByEnemy(hero,enemy);
                System.out.print(hero.name +  " получает " + DPSEnemy(enemy) + " урона от атаки " + enemy.name +"\nУ него осталось " + hero.HP + " здоровья!\n");
            }else {
                rand = random.nextInt(3);
                if (rand == 0) {
                    hero.magic.spellCast1(hero, enemy);
                    System.out.print("У него осталось " + enemy.HP + " здоровья!\n");
                } else if (rand == 1) {
                    hero.magic.spellCast2(hero, enemy);
                    System.out.print("У него осталось " + enemy.HP + " здоровья!\n");
                } else {
                    hero.magic.spellCast3(hero, enemy);
                    System.out.print("У него осталось " + enemy.HP + " здоровья!\n");
                }
            }
        }
        if (hero.HP <= 0){
            System.out.print(hero.name + " погиб!\n");
        }else if(enemy.HP<=0){
            System.out.print(enemy.name + " погиб!\n У "+ hero.name +" осталось " + hero.HP + "\n");

        }
    }
}
