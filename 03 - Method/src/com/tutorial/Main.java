package com.tutorial;

/**
 * Mahasiswa
 */
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    
    Mahasiswa (String nama, String nim, String jurusan){ 
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method Tanpa Return dan Tanpa Parameter
    void show(){
        System.out.println("Mahasiswa : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
    }

    // Method Tanpa Return tapi punya parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // Method memakai return tapi tanpa parameter
    String getNama(){
        return this.nama;
    }

    // Method dengan return dan parameter
    String sayHi(String messege){
        return messege + " Selamat Datang " + this.nama;
    }

}

public class Main {
    public static void main(String[] args) {

        // ini buat mengisi konstruktor nya
        Mahasiswa mahasiswa1 = new Mahasiswa("Adrian Maulana", "6706220037", "D3 Rekayasa Perangkat Lunak Aplikasi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ucup Maulana", "6706220040", "D3 Rekayasa Perangkat Lunak Aplikasi");


        
        System.out.println("=======Show======");
        // show
        mahasiswa1.show();
        mahasiswa2.show();


        
        System.out.println("=======setNama======");
        // setNama
        mahasiswa1.setNama("Adrian Saja");
        mahasiswa1.show();


        
        System.out.println("=======getNama======");
        // getnama
        System.out.println(mahasiswa1.getNama());



        System.out.println("=======Method return dan parameter======");
        // saiHi
        String data = mahasiswa1.sayHi("Halo");
        System.out.println(data);
    }
}
