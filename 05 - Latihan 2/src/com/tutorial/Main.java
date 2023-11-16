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

    // void test (){
    //     System.out.println(this.name);
    // }

    void attack(Player musuh){
        String skillName = this.skill.name;
        double atttackPower = this.skill.atttackPower;
        System.out.println(this.name + " attack " + musuh.name + " with skill " + skillName + " with damage : " + atttackPower);
        musuh.diserang(atttackPower);
    }

    void diserang(double atttackPower){
        // mengambil damage
        double damage;
        double defenceArmor = this.armor.defencePower;
        if (defenceArmor < atttackPower) {
            damage = atttackPower - defenceArmor;
        } else {
            damage = 0;
        }

        this.healt -= damage;
        System.out.println("\n" + this.name + " gets damage " + damage);
    }

    void equipSkill(Skill skill){
        this.skill = skill;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName\t: " + this.name);
        System.out.println("Healt\t: " + this.healt + " hp");
        this.skill.display();
        this.armor.display();
        System.out.println();
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
        System.out.println("Skill\t: " + this.name + ", attack power : " + this.atttackPower);
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
        System.out.println("Armor\t: " + this.name + ", defence power : " + this.defencePower);
    }
}



public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Goku", 324);
        Player player2 = new Player("Piccolo", 309);

        Skill kamehameha = new Skill("KameHameHa", 50);
        Skill makankosappo = new Skill("MakanKoSappo", 100);

        Armor tempurungMutenRoshi = new Armor("Tempurung Muten Roshi", 50);
        Armor bajuUngu = new Armor("Baju Ungu", 10);

        player1.equipSkill(kamehameha);
        player1.equipArmor(tempurungMutenRoshi);

        player2.equipSkill(makankosappo);
        player2.equipArmor(bajuUngu); // hehe :v

        player1.display();
        player2.display();

        System.out.println("\n============= Turn "+ player1.name + " 1 ==============\n");
        player1.attack(player2);
        player2.display();
        System.out.println("\n============= Turn "+ player2.name + " 1 ==============\n");
        player2.attack(player1);
        player1.display();
        
        // player1.test();
    }
}
