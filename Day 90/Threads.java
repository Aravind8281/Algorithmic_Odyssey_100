class myRunnable implements Runnable{
    String threadName;
    public myRunnable(String name){
        this.threadName=name;
    }
    @ Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(threadName+"  "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.print(e);
            }
        } 
    }
}
class Main{
    public static void main (String[] args) {
        Thread th1=new Thread(new myRunnable("Thread 1"));
        th1.start();
        Thread th2=new Thread(new myRunnable("Thread 2"));
        th2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
