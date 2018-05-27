package jhotel;
/**
 * Class DoubleRoom digunakan untuk room tipe double.
 *
 * @author Fahmi Firman F
 * @version 20-05-2018
 */
public class DoubleRoom extends Room
{

    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Overloading constructor for objects of class DoubleRoom
     *
     * @param hotel berisi objek hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(250000);
               
    }

    /**
     * digunakan untuk mengambil nilai objek customer2
     *
     * @return customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

    /**
     * digunakan untuk mengambil tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * digunakan untuk menentukan nilai objek customer2
     *
     * @param customer2 berisi objek customer2
     */
    public void setCustomer2(Customer customer2)
    { 
       this.customer2 = customer2; 
    }

    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
