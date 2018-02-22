

public class Customer
{
    protected int id;
    protected String nama;

    public Customer(int idnew, String namanew)
    {
        id = idnew;
        nama = namanew;
    }

    public int getID()
    {
        return 0;
    }
    
    public String getNama()
    {
     return nama;   
    }
    
    public void setID(int idx)
    {
     id = idx;
    }
    
    public void setNama(String namax)
    {
     nama = namax;
    }
}