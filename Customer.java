/**
 * Kelas ini untuk menunjukkan informasi dari Customer
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */

public class Customer
{
    protected int id;
    protected String nama;
    
    public Customer()
    {
    }

    public Customer(int id, String nama)
    {
        this.nama = nama;
        this.id = id;
    }

    /**
     * method ini digunakan untuk medapatkan nilai id customer
     *
     * 
     * @return id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * method ini digunakan untuk medapatkan nama customer
     *
     * 
     * @return nama
     */
    public String getNama()
    {
     return nama;   
    }
    
    /**
     * method ini digunakan untuk mengset id customer
     *
     * @param id
     * @return id
     */
    public void setID(int id)
    {
     this.id = id;
    }
    
    /**
     * method ini digunakan untuk memberi nilai nama customer
     *
     * @param nama
     * @return nama
     */
    public void setNama(String nama)
    {
     this.nama = nama;
    }
    
    public void printData() 
    {
        System.out.println(" ID : " +id);
        System.out.println(" Nama Pelanggan : " +nama); 
    }
    
}