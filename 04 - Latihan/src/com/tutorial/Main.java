package com.tutorial;

class Player{
    String name;
    double healt;
    int level;
    // object member
    Skill skill;
    Armor armor;

    Player(String name, double healt){
        this.name = name;
        this.healt = healt;
    } 

    void equipSkill(Skill skill){
        this.skill = skill;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Healt : " + this.healt + " hp");
        this.skill.display();
        this.armor.display();
    }
}

class Skill {
    String name;
    double atttackPower;

    Skill(String name, double atttackPower){
        this.name = name;
        this.atttackPower = atttackPower;
    }

    void display(){
        System.out.println("Skill : " + this.name + ", attack power : " + this.atttackPower);
    }
}

class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + ", defence power : " + this.defencePower);
    }
}



public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Goku", 324);
        Player player2 = new Player("Piccolo", 309);

        Skill kamehameha = new Skill("KameHameHa", 50);
        Skill makankosappo = new Skill("MakanKoSappo", 100);

        Armor tempurungMutenRoshi = new Armor("Tempurung Muten Roshi", 100);
        Armor bajuUngu = new Armor("Baju Ungu", 10);

        player1.equipSkill(kamehameha);
        player1.equipArmor(tempurungMutenRoshi);

        player2.equipSkill(makankosappo);
        player2.equipArmor(bajuUngu); // hehe :v

        player1.display();
        player2.display();
    }
}
