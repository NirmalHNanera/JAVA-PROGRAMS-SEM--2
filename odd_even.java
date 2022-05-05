class Odd extends Thread{
    
    public void run(){
        for(int i=1;i<=500;i++){
            if(i%2!=0){
                System.out.println("Odd Number : "+i);
            }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }
}
class even extends Thread{
    
    public void run(){
        for(int i=1;i<=500;i++){
            if(i%2==0){
                System.out.println("Even Number : "+i);
            }
            try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }
}
public class odd_even{
    public static void main(String[] args){
        Odd t1=new Odd();
        even t2=new even();
        t1.start();
        t2.start();
    }
}