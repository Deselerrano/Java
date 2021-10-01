package com.company;
import java.util.Random;

public class Hero extends Creature {
    public int HP;
    public int exp;
    public int lvl;
    public int AD;
    public int armor;
    public double AS;
    public int haveWeapon;
    public int sex;
    Magic magic;
    Weapon weapon;
    Hero(){
        haveWeapon = 0;
        Random random = new Random();
        sex = random.nextInt(2);
        if (sex == 1) {
            name = Names.namesHeroMan.get(random.nextInt(7));
        }else{
            name = Names.namesHeroWoman.get(random.nextInt(7));
        }
        if (random.nextInt(5) + 1 == 1){
            magic = new Fire();
        } else if (random.nextInt(5) + 1 == 2){
            magic = new Water();
        } else if (random.nextInt(5) + 1 == 3){
            magic = new Frost();
        } else if (random.nextInt(5) + 1 == 4){
            magic = new Air();
        } else if (random.nextInt(5) + 1 == 5){
            magic = new Earth();
        } else {
            magic = new Ether();
        }
        HP = (int)(lvl*0.1 + 1) * random.nextInt(100) + 50;
        exp = 0;
        lvl = 1;
        AD = (lvl/10 + 1) * random.nextInt(40) + 20;
        armor = (lvl/10 + 1) * random.nextInt(25) + 15;
        AS = (lvl/10 + 1) * random.nextInt(15)/10 + 0.5;
        haveWeapon = 0;
        bag = 10;
        id = 100000 + sex*10000 + magic.id*1000+ random.nextInt(999);
    }
    Hero(String name , int sex, int magia){
        haveWeapon = 0;
        Random random = new Random();
        this.name = name;
        if (magia == 1){
            magic = new Fire();
        } else if (magia == 2){
            magic = new Water();
        } else if (magia == 3){
            magic = new Frost();
        } else if (magia == 4){
            magic = new Air();
        } else if (magia == 5){
            magic = new Earth();
        } else {
            magic = new Ether();
        }
        HP = (lvl/10 + 1) * random.nextInt(100) + 50;
        exp = 0;
        lvl = 1;
        AD = (lvl/10 + 1) * random.nextInt(40) + 20;
        armor = (lvl/10 + 1) * random.nextInt(25) + 15;
        AS = (lvl/10 + 1) * random.nextInt(15)/10 + 0.5;
        this.sex = sex;
        haveWeapon = 0;
        bag = 10;
        id = 100000 + sex*10000 + magic.id*1000+ random.nextInt(999);
    }
    public void getInfo(){
        System.out.print("Вашего героя зовут: \n");
        System.out.print(name);
        System.out.print("\n");
        System.out.print("Пол: \n");
        if (sex == 1){
            System.out.print("Мужской");
        }else{
            System.out.print("Женский");
        }
        System.out.print("\n");
        System.out.print("Характеристики: \n");
        System.out.print("HP: " + HP + "\n");
        System.out.print("Exp: " + exp + "\n");
        System.out.print("Lvl: " + lvl + "\n");
        System.out.print("Attack Damage: " + AD + "\n");
        System.out.print("Armor: " + armor + "\n");
        System.out.print("Attack Speed" + AS + "\n");
        if (haveWeapon == 1){
            System.out.print("Есть оружие");
        }else{
            System.out.print("Нет оружия");
        }
        System.out.print("\n");
        System.out.print("Владеет магией " + magic.name + "\n");
    }
}