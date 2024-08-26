package org.example.M4_Default_Functions_in_Threads;

class Cake extends Thread {
    public void run() {
        try {
            System.out.println("Mixing Ingredients for Cake " + Cake.currentThread().getName());
            System.out.println("Baking Cake " + Cake.currentThread().getName());
            System.out.println("Decorating Cake " + Cake.currentThread().getName() + "----------------------");
        }
        catch (Exception e) {
            System.out.println("Exception caught " + e);
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        int cakeCount = 5;
        for (int i = 1; i <= cakeCount; i++) {
            Cake c = new Cake();
            c.setName("" + i);
            c.start();
//            c.setPriority(Thread.MAX_PRIORITY);
//            System.out.println(c.getPriority());
            System.out.println(c.isAlive());
//            try{
//                if(i == cakeCount - 3) {
//                    c.sleep(2000);
//                }
//            }
//            catch (InterruptedException ignored) {
//
//            }
        }
        Cake sample = new Cake();
        sample.start();
        System.out.println(sample.isAlive());
        try {
            sample.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exception caught " + e);
        }
        System.out.println(sample.isAlive());
        System.out.println("----------------- Outside loop -----------------");
//        System.out.println(1/0);
    }
}


//  THREAD IN-BUILD METHODS:
//  1 -> getName()
//  2 -> getId()
//  3 -> setName()
//  4 -> join()
//  5 -> interrupt()
//  6 -> isAlive()
//  7 -> start()
//  8 -> sleep()
//  9 -> MAX_PRIORITY
//  10 -> MIN_PRIORITY
//  11 -> NORM_PRIORITY