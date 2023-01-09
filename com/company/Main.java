package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        System.out.println("We have 2 different League of Legend (Game) magic characters.");
        System.out.println("\n");

        Characters[] characters={new Akali("Ahri","conspirator","Wizard",100),
                                 new Ahri("Akali","conspirator","-",90)};
        printer(characters);

        System.out.println("\n");
        Akali akali1=new Akali();
        collectiveAttacks(akali1);
        akali1.setSkills("Five Point Attack = Slows enemies by 50% for 0.5 seconds.");


        System.out.println("\n");
        Ahri ahri1=new Ahri();
        collectiveAttacks(ahri1);
        ahri1.setSkills("Fox Fire =chase to enemies and gives a big damage by three fox");

    }
    public static void printer(Characters[] characters){
        for(Characters characters1:characters){
            characters1.print();
        }

    }
    public static void collectiveAttacks(IAttackAbilities iAttackAbilities){
        iAttackAbilities.eAttack();
        iAttackAbilities.qAttack();
        iAttackAbilities.rAttack();
        iAttackAbilities.wAttack();
    }

}
