package com.company;

public class Main {
    int numAleatorio = Hilos.numAleatorio;
    long total= Hilo2.total;
    public static void main(String[] args) {


        try {
            Hilos hilo1 = new Hilos();
            hilo1.setName("Hilo1");
            hilo1.start();
            hilo1.join();
            Hilo2 hilo2 = new Hilo2();
            hilo2.setName("Hilo2");
            hilo2.start();
            hilo2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void mensaje( int numAleatorio,long total  ){
        System.out.println("Se ha ejecutado: " +numAleatorio+" veces\nHa tardado: "+ total+" milisegundos");
    }


}
