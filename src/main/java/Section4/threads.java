package Section4;

class MyThread extends Thread{
    public void run(){
        for(int i = 1;i <=5;i++){
            System.out.println(Thread.currentThread().getName() + " - Count: "+i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}

class myRunnable implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}
public class threads {
    public static void main(String[] args) {

        Thread t1 = new Thread(new myRunnable(), "Runnable - 1");
        Thread t2 = new Thread(new myRunnable(), "Runnable - 2");

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("Thread-1");
        m2.setName("Thread-2");

        m1.start();
        m2.start();
        t1.start();
        t2.start();
    }
}
