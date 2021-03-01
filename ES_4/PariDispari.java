public class PariDispari extends Thread{
    private int massimo;
    private boolean pari;
    private int ritardo=500;

    public PariDispari(int massimo, boolean pari){
        this.massimo=massimo;
        this.pari=pari;
    }
    public void run(){
        String thrName;
        thrName=Thread.currentThread().getName();
        for(int i=0;i<massimo;i++){
            if(pari){
                if(i%2==0){
                    System.out.println(thrName+" -pari "+i);
                }
            }else{
                if(i%2!=0){
                    System.out.println(thrName+" -dispari "+i);
                }
            }
            /*
            try{
                 Thread.sleep(ritardo);
            }catch(InterruptedException e){
                System.out.println(e);
            }*/
        }
    }

}