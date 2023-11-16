package com.tutorial;

class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Buku buku1 = new Buku("Naruto", "Masashi Kishimoto");
        buku1.display();
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // Assigment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        buku2.judul = "Boruto";
        buku1.display();
        buku2.display();

        fungsi(buku2);
        buku1.display();
        buku2.display();
    }
    public static void fungsi (Buku dataBuku){
        String addressBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("\nAddress dalam fungsi : " + addressBuku);
        dataBuku.penulis = "Hiroshi";
    }
}
