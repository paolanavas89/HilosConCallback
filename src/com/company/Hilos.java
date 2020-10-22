package com.company;
import java.util.Random;

public class Hilos extends Thread {
    public static int numAleatorio;

    @Override
    public void run() {
        try {

            numAleatorio=(int)Math.floor(Math.random()*(20-4+1)+(4));
            sleep(4000);
            System.out.println("El número aleatorio es: "+numAleatorio);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int getNumAleatorio(){
        return numAleatorio;
    }



}


