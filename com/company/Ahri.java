package com.company;



public class Ahri extends Characters implements IAttackAbilities {

    public Ahri(){}
    public Ahri(String name,String type, String skills, int totalDamage) {
        super(name,type, skills, totalDamage);
    }




    @Override
    public void qAttack() {
        System.out.println("Ahri's Q (ORB OF DECEPTION) skill will causes 4 damage!");
    }

    @Override
    public void wAttack() {
        System.out.println("Ahri's W (FOX-FIRE) skill will causes 6 damage!");

    }

    @Override
    public void eAttack() {
        System.out.println("Ahri's E (CHARM) skill will causes 3 damage!");

    }

    @Override
    public void rAttack() {
        System.out.println("Ahri's R (SPIRIT RUSH) skill will causes 2 damage!");

    }
}
