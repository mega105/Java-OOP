package com.tutorial;

class Player {
    String name; // bisa diakses diluar class
    public int exp; // bisa diakses diluar class
    private int healt; // hanya bisa diakses di class nya sendiri

    Player (String name, int exp, int healt) {
        this.name = name;
        this.exp = exp;
        this.healt = healt;
    }

    void display() {
        tambahHealt();
        System.out.println("\nNama\t: "+this.name);
        System.out.println("Exp\t: "+this.exp);
        System.out.println("Healt\t: "+this.healt);
    }
    void ubahNama(String newName){
        this.name = newName;
    }
    
    void tambahHealt(){
        this.healt += 100;
    }
}


public class Main {
    public static void main(String[] args) {
        
        Player player = new Player("Adria", 100, 100);

        // default 
        System.out.println(player.name);
        player.name = "Adrian";
        System.out.println(player.name);

        // public
        System.out.println(player.exp);
        player.exp = 200;
        System.out.println(player.exp);


        // Class Private tidak bisa diakses diluar class 
        // System.out.println(player.healt);
        // player.healt = 200;
        // System.out.println(player.healt);

        // method
        player.display();
        player.ubahNama("Adrian Maulana");
        player.display();

    }
}