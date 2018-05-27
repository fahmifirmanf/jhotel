package jhotel;
/**
 * Class PremiumRoom untuk tipe room premium.
 *
 * @author FahmiFF
 * @version 20-05-2014
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * Overloading Constructor for objects of class DoubleRoom
     *
     * @param hotel objek Hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(500000);
    }

    /**
     * untuk mendaptkan nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
     return TIPE_KAMAR;          
    }

    /**
     * untuk mendapatkan nilai diskon
     *
     * @return DISCOUNT
     */
    public double getDiscount()
    {
     return DISCOUNT;          
    }

    /**
     * untuk menentukan nilai daily tarif
     *
     * @param dailyTariff nilai daily tariff
     */
    public void setDailyTariff(double dailyTariff)
    { 
       dailyTariff = dailyTariff*DISCOUNT;
    }
    
}

