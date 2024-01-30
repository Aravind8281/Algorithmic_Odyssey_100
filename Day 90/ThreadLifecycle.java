class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is in the 'Runnable' state and executing.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has completed its work.");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.State state = myThread.getState();
        System.out.println("Thread state after starting: " + state);
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = myThread.getState();
        System.out.println("Thread state after joining: " + state);

        System.out.println("Main thread exiting.");
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is in the 'Runnable' state and executing.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has completed its work.");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.State state = myThread.getState();
        System.out.println("Thread state after starting: " + state);
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = myThread.getState();
        System.out.println("Thread state after joining: " + state);

        System.out.println("Main thread exiting.");
    }
}
