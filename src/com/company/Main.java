package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.getInfo();
        Enemy enemy = new Enemy();
        Weapon a = new Weapon("Нож",1,12,2);
        Weapon b = new Weapon("Меч",2,32,1);
        System.out.print("DPS " + hero.name + " "+ GameLogic.DPSHero(hero) + "!\n");
        GameLogic.EquipWeaponHero(hero,b);
        GameLogic.EquipWeaponEnemy(enemy,a);
        System.out.print("DPS " + hero.name + " c мечом "+ GameLogic.DPSHero(hero) + "!\n");
        while (hero.HP >=0) {
            GameLogic.Fight(hero, enemy);
            enemy = new Enemy();
        }
    }
}
