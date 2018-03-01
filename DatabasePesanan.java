
/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Pesanan Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class DatabasePesanan
{
    private String[] list_pesanan;

    
    public boolean addPesanan(Pesanan baru)
    {
        return false;
    }

    public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
    public Pesanan getPesanan(Customer cust)
    {
        Pesanan pesan = new Pesanan();
        return pesan;
    } 
    
    public void pesananDibatalkan(Pesanan pesan)
    {
    }
}
