package jhotel;
/**
 * Class SingleRoom untuk tipe room single.
 *
 * @author FahmiFF
 * @version 20-05-2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Overloading Constructor for objects of class SingleRoom
     *
     * @param hotel object hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(150000);
    }

    /**
     * mendapatkan nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
