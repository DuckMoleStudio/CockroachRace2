
public class Cockroach extends Thread {

    Distance curDistance = new Distance();
    int hopCounter = 0;

    Cockroach(String name){
        super(name);
    }

    public void run(){


        try{
            while(!isInterrupted()){
                Thread.sleep(1000);
                curDistance.increment();
                hopCounter++;
            }
        }
        catch(InterruptedException e){
            //System.out.println(getName() + " stopped");
        }


    }


}
