package org.example.M1_Thread_Class;

class Cake extends Thread {
    public void run() {
        try{
            System.out.println("Mixing Ingredients for Cake " + Cake.currentThread().getId());
            System.out.println("Baking Cake " + Cake.currentThread().getId());
            System.out.println("Decorating Cake " + Cake.currentThread().getId());
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class Thread_Class {
    public static void main(String[] args) {
        int cakeCount = 5;
        for(int i = 0; i < cakeCount; i++) {
            Cake cake = new Cake();
//            cake.run();  // Multi-threading not working. Works only in series
            cake.start();   // Multi-threading works.
        }
    }
}


//  Multi-threading always must be executed in a try-catch block, because there is a high-chance for exceptions
//  while implementing.

//  Possible Exceptions:
//  1 -> Interrupted Exceptions (try to run a thread while it is in sleep state or waiting)
