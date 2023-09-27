package com.tutorial;

//class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
    
}


//class dengan constructor
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;


    //Ini Constructor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan) {
        nama = inputNama;
        nim = inputNim;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Adrian", "670622", "RPLA");        
        Mahasiswa mahasiswa2 = new Mahasiswa("Maulana", "0037", "RPLA");        

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "Polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

    }
}
