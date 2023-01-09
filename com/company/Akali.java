package com.company;

public class Akali extends Characters implements IAttackAbilities{

    public Akali(){

    }

    public Akali(String name,String type, String skills, int totalDamage) {
        super(name,type, skills, totalDamage);
    }


    @Override
    public void qAttack() {
        System.out.println("Akali's Q (FIVE POINT STRIKE) skill will causes 6 damage!");

    }

    @Override
    public void wAttack() {
        System.out.println("Akali's W (TWILIGHT SHROUD) skill will causes 0 damage!");

    }

    @Override
    public void eAttack() {
        System.out.println("Akali's E (SHURIKEN FLIP) skill will causes 5 damage!");

    }

    @Override
    public void rAttack() {
        System.out.println("Akali's R (PERFECT EXECUTION) skill will causes 8 damage!");

    }
}
