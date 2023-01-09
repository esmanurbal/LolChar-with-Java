package com.company;

public abstract class Characters {
    private String name;
    private String type;
    private String skills;
    private int totalDamage;

    public Characters(){}

    public Characters(String name ,String type, String skills,int totalDamage){
        this.name=name;
        this.type=type;
        this.skills=skills;
        this.totalDamage=totalDamage;
    }
    public String getSkills(){
        return skills;
    }
    public void setSkills(String skills){
        this.skills=skills;
        System.out.println("Added a new update to skills : "+this.skills);
    }
    public void print(){
        System.out.println("********************");
        System.out.println("Character name: "+this.name);
        System.out.println("Type is determined : "+this.type);
        System.out.println("Skills are determined: "+this.skills);
        System.out.println("The Total Damage : "+this.totalDamage);
        System.out.println("******************************");
    }

}
