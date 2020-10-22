package com.company;

public class Hilo2 extends Thread {


    int num = Hilos.numAleatorio;
    public static long total;

    @Override
    public void run() {

        long tiempoDeEspera=2000;
        long tiempoDeFin;
        long tiempoDeInicio;
        try {

            System.out.println("Entro en el segundo Hilo");
            tiempoDeInicio = System.currentTimeMillis();
            for (int i = 0; i < num; i++){
                sleep(tiempoDeEspera);
                System.out.println("Me estoy repitiendo "+i+" veces");
            }
            tiempoDeFin = System.currentTimeMillis();
            System.out.println("Salgo del Hilo 2");
            total=tiempoDeFin - tiempoDeInicio;
            Main.mensaje(num,total);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static long getTotal(){
        return total;
    }




}
