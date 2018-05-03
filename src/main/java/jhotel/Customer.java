package jhotel;
/**
 * Kelas ini untuk menunjukkan informasi dari Customer
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
import java.util.Date;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;
import java.util.GregorianCalendar;
public class Customer
{
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;
    
    public Customer(String nama,  int tanggal, int bulan, int tahun, String email, String password )
    {

        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
        this.password = password;
        
    }
    
    public Customer(int id1, String nama1, Date dob1, String emaill, String passwordl)
    {
        id = DatabaseCustomer.getLastCustomerID()+1;
        nama = nama1;
        dob = dob1;
        email = email;
        password = passwordl;
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

    public String getPassword(){
        return password;
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

    public void setPassword(String password){
        this.password = password;
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