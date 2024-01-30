class myRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +"  "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Main{
    public static void main (String[] args) {
        Thread th1=new Thread(new myRunnable(),"Thread 1");
        Thread th2=new Thread(new myRunnable(),"Thread 2");
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        
    }
}
