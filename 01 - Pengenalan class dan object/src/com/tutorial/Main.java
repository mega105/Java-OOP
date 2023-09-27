package com.tutorial;

class Makanan{
    String nama;
    
}

public class Main {
    public static void main(String[] args) {

        Makanan makanan1 = new Makanan();
        makanan1.nama = "Bakso";

        Makanan makanan2 = new Makanan();
        makanan2.nama = "Batagor";
        
        System.out.println(makanan1.nama);
        System.out.println(makanan2.nama);

    }
}
