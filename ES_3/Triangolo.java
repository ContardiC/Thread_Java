public class Triangolo implements Runnable {
    String suono;
    int volte;
    public Triangolo(String suono, int volte){
        this.suono=suono;
        this.volte=volte;
    }
    public void run(){
        for(int i=0;i<volte;i++){
            System.out.println((i+1)+suono+" ");
        }
    }
}
