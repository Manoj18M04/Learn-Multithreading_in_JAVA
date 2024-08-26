package org.example.M2_Runnable_Interface;

//class Desert {
//
//}

class Cake implements Runnable {
    public void run() {
        try {
            System.out.println("Mixing Ingredients for Cake " + Thread.currentThread().getId());
            System.out.println("Baking Cake " + Thread.currentThread().getId());
            System.out.println("Decorating Cake " + Thread.currentThread().getId());
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        int cakeCount = 5;
        for(int i = 0; i < cakeCount; i++) {
            Cake c = new Cake();
            Thread t1 = new Thread(c);  // As no thread class is extended so no start method available in Cake class.
//            cake.run();  // Multi-threading not working. Works only in series
            t1.start();   // Multi-threading works.
        }
    }
}


//  Runnable Interface works same like Thread class, But in case, want to extend any class, it is not possible with
//  Thread class, as already the Thread class extended to the class (Since Multiple Inheritance is not possible)
//  So, Using Runnable Interface helps in extending another class as interface gave the luxury for multiple inheritance.