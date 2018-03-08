
/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Pesanan Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class DatabasePesanan
{
    private String[] list_pesanan;

    
    /**
     * method ini digunakan untuk menambah pesanan baru
     * 
     *
     * @param baru
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        return false;
    }

    /**
     * method ini digunakan untuk menghapus pesanan
     * 
     *
     * @param pesan
     * @return false
     */public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    /**
     * method ini digunakan untuk mendapat Pesanan 
     *
     * @param cust
     * @return pesan
     */
    public Pesanan getPesanan(Customer cust)
    {
        Pesanan pesan = new Pesanan();
        return pesan;
    } 
    
    /**
     * method ini digunakan untuk pesanan dibatalkan
     *
     * @param pesan
     * 
     */
    public void pesananDibatalkan(Pesanan pesan)
    {
    }
}
