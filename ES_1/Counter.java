public class Counter extends Thread{
    public void run(){
        setName("Thread Contatore");
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<7;i++){
            System.out.print((i+1)+" ");
        }
    }
}