public class Threads {
    public static void main(String[] args) {
        // Threads allow the program to do multiple things at the same time.
        // There are two ways to create a thread:
        // 1. Extend the Thread class in the class to be threaded and execute the run() method.
        // 2. Implement the Runnable interface in the class to be threaded and execute the run() method.
        // To run the threaded classes, use the start() method on the created object.
        FirstWay firstWay = new FirstWay();
        firstWay.start();
        // If there is an implemented class, an object should be created using the Thread class as well.
        SecondWay secondWay = new SecondWay();
        Thread thread = new Thread(secondWay);
        thread.start();
    }
}

class FirstWay extends Thread {
    public void run() {
        System.out.println("This code is running inside a thread.");
    }
}

class SecondWay implements Runnable {
    public void run() {
        System.out.println("This code is running inside a thread.");
    }
}
