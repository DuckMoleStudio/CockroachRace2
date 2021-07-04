import java.util.Random;

public class Cockroach extends Thread {
    int distance = 0;
    Random random = new Random();
    final int maxHop = 11; // max distance increment per iteration, centimeters
    int hopCounter = 0;

    Cockroach(String name){
        super(name);
    }

    public void run(){


        try{
            while(!isInterrupted()){
                Thread.sleep(1000);
                distance += random.nextInt(maxHop);
                hopCounter++;
            }
        }
        catch(InterruptedException e){
            //System.out.println(getName() + " stopped");
        }


    }


}
