import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
/**
 * Write a description of class LetsGo here.
 *
 * @author Fahmi Firman F
 * @version 2018.04.21
 */
public class LetsGo
{
    // instance variables - replace the example below with your own
    private static int[] delay = new int[3];
    private static int[][] finaldelay = new int[3][20];
    private static int counter=0;

    
    public static void Random(){
        while(counter<=19)
        {
            for (int x=0;x<3;x++){
                delay[x]=ThreadLocalRandom.current().nextInt(100, 500 + 1);
            }
            Arrays.sort(delay);

            for (int x=0;x<3;x++){
                finaldelay[x][counter]=delay[x];

            }
            counter++;
        }

    }

    public static int getRandom(String name, int id){
        if(name=="Messi"){
            return finaldelay[0][id];
        } else if(name=="Andres"){
            return finaldelay[1][id];
        } else return finaldelay[2][id];
    
    }
    
    public static void main(String args[]) {
        Random();
        RunForYourLife R1 = new RunForYourLife( "Messi");
        R1.start();

        RunForYourLife R2 = new RunForYourLife( "Lionel");
        R2.start();

        RunForYourLife R3 = new RunForYourLife( "Andres");
        R3.start();
    }
}
