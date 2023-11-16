package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;
        
    Data () {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    void display(){
        System.out.println("Public\t: " + this.intPublic);
        System.out.println("GETTER\t: " + this.intPrivate);
        System.out.println("SETTER\t: " + this.doublePrivate);
    }


    // GETTER
    public int getIntPrivate(){
       return this.intPrivate = 5;
    }

    // SETTER
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // SETTER
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // GETTER
    public double getJari2(){
        return this.diameter/2;
    }

    // GETTER
    public double getLuas(){
        return 3.14 * this.diameter*this.diameter/4;
    }


    void display(){
        System.out.println("Diameter\t: " + this.diameter);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Data object = new Data();


        // read and wrire menggunakan Public
        object.intPublic = 10; // write
        System.out.println(object.intPublic); // read

        // read Only (Menggunakkan GETTER)
        int data = object.getIntPrivate();
        System.out.println("Getter : " + data);

        // write Only (Menggunakan SETTER)
        object.setDoublePrivate(0.05);
        object.display();

        System.out.println("============ Lingkaran ===============");
        Lingkaran lingkaran = new Lingkaran(5);
        lingkaran.display();
        System.out.println("GetJariJari\t: " + lingkaran.getJari2());
        lingkaran.setJari2(10);
        lingkaran.display();
        System.out.println("GetJariJari\t: " + lingkaran.getJari2());
        System.out.println("GetLuas\t: " + lingkaran.getLuas());

    }
}