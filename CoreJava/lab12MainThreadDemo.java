class ThreadA implements Runnable {
    public void run() {
        System.out.println("Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

// ThreadB class
class ThreadB implements Runnable {
    public void run() {
        System.out.println("Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

// Main class
public class lab12MainThreadDemo {
    public static void main(String[] args) {

        ThreadA objA = new ThreadA();
        ThreadB objB = new ThreadB();

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();
    }
}
