/**
 * Kelas ini untuk menunjukkan informasi dari Customer
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;
import java.util.GregorianCalendar;
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    
    public Customer(int id, String nama,  int tanggal, int bulan, int tahun )
    {
        this.nama = nama;
        this.id = id;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        
    }
    
    public Customer(int id1, String nama1, Date dob1)
    {
        id = id1;
        nama = nama1;
        dob = dob1;
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
    
    public String getEmail()
    {
     return email;
    }
    
    public Date getDOB()
    {
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(dob);      
            
        System.out.print(output);              
        
        return dob;
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
    
    public void setEmail(String email){
        String pattern = 
         "^[_&*_~A-Za-z0-9-\\+]+(\\.[_&*_~A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.matches()){
            this.email = email;            
        }
        else {
        System.out.println("Salah");
        this.email=null;}
        
    }
    
    
    
    public void setDOB(Date dob){
        this.dob = dob;
    }
    
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null){
            return "\n Customer ID : " + id +
                   "\n Name : " + nama +
                   "\n E-Mail " + email +
                   "\n Date of Birth  : " + getDOB() +
                   "\n Booking order is in progress";
                }
        else{
            return "\n Customer ID : " + id +
                   "\n Name : " + nama +
                   "\n E-Mail " + email +
                   "\n Date of Birth  : " + getDOB();
                }
    }
    
    /**public void printData() 
    {
        
        System.out.println("\nCustomer");
        System.out.println(" ID : " +id);
        System.out.println(" Nama Pelanggan : " +nama); 
    }
    */
    
}