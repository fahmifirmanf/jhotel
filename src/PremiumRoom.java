
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;
    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
     return TIPE_KAMAR;          
    }
    
    public double getDiscount()
    {
     return DISCOUNT;          
    }
    
    public void setDailyTariff(double dailyTariff)
    { 
       super.dailyTariff = super.dailyTariff*DISCOUNT;
    }
    
}

