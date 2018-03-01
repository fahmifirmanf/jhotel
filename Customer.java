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

    public int getID()
    {
        return id;
    }
    
    public String getNama()
    {
     return nama;   
    }
    
    public void setID(int id)
    {
     this.id = id;
    }
    
    public void setNama(String nama)
    {
     this.nama = nama;
    }
    
    public void printData() 
    {
        System.out.println(" Nama Customer : " +nama); 
    }
    
}