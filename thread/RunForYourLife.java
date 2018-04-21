
/**
 * Write a description of class RunForYourLive here.
 *
 * @author Fahmi Firman F
 * @version 2018.04.21
 */

public class RunForYourLife implements Runnable
{
    // instance variables - replace the example below with your own
     private Thread t;
   private String threadName;

    /**
     * Constructor for objects of class RunForYourLive
     */
    public RunForYourLife(String name)
    {
        // initialise instance variables
        threadName = name;
        System.out.println(name+", READY!!");
    }
    
    public String getName(){
        return threadName;
    }
    
     public void run() {
      System.out.println(getName()+", GO!!");
      int cek;
      try {
         for(int i = 0; i < 20; i++) {
             Thread.sleep(LetsGo.getRandom(getName(),i));
                cek = i+1;
                System.out.println(getName()+" has passed checkpoint "+ cek + " With delay "+LetsGo.getRandom(getName(),i));
            
         }
      } catch (InterruptedException e) {
         System.out.println(getName()+ " was interrupted.");
      }
      System.out.println(getName()+ " has finished");
   }
   
   public void start () {
      System.out.println(getName()+", SET" );
      if (t == null) {
         t = new Thread (this, getName());
         t.start ();
      }
   }
     
   
}