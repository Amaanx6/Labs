3.c) Write a Java program to illustrate the concept of threading using Thread Class and runnable Interface.

// Using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread (Thread Class): " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread (Runnable Interface): " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Runnable interrupted.");
            }
        }
    }
}

public class ThreadingExample {
    public static void main(String[] args) {
        // Using Thread class
        MyThread thread1 = new MyThread();
        
        // Using Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

