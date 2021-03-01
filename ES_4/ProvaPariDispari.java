public class ProvaPariDispari {
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("Serve un numero intero");
            return;
        }
        int n=Integer.parseInt(args[0]);
        Thread TP=new PariDispari(n+1,true);
        Thread TD=new PariDispari(n+1,false);
        TP.start();
        TD.start();
        /*
        try{
            TP.join();
            TD.join();
        }catch(Exception e){
            System.out.println(e);
        }
        */
        System.out.println("Fine conteggio");

    }
}
