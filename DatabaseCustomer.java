
/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Customer Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class DatabaseCustomer
{
    private String[] list_customer;
    
    public static boolean addCustomer(Customer baru)
    {
        return false;
    }

   
    /**
     * method ini digunakan untuk menghapus customer dari database berdasarkan
     * id
     *
     * @param id
     * @return false
     */
    public boolean removeCustomer(int id)
    {
        return false;
    }
    
    /**
     * method ini digunakan untuk mencari customer di database
     *
     * 
     * @return list_customer
     */
    public String[] getCustomerDatabase()
    {
        return list_customer;
    }
}
