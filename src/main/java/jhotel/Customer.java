package jhotel;

/**
 * Kelas ini untuk menunjukkan dan mengelola informasi dari Customer
 *
 * @author Fahmi Firman F
 * @version 20-05-2018
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

    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama berisi nama Customer
     * @param tanggal berisi tanggal
     * @param bulan berisi bulan
     * @param tahun berisi tahun
     */
    public Customer(String nama,  int tanggal, int bulan, int tahun, String email, String password )
    {

        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
        this.password = password;
        
    }

    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama1 berisi nama customer.
     * @param dob1 berisi objek Date.
     */
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
     * @return nama berisi nama customer
     */
    public String getNama()
    {
     return nama;   
    }

    /**
     * method ini digunakan untuk mendapatikan nilai email.
     *
     * @return email berisi email.
     */
    public String getEmail()
    {
     return email;
    }

    /**
     * untuk mendapatkan nilai password customer
     *
     * @return password
     */
    public String getPassword(){
        return password;
    }

    /**
     * digunakan untuk mendapatkan nilai tanggal lahirbertipe Date
     *
     * @return dob
     */
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
     *
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

    /**
     * digunakan untuk menentukan nilai password
     *
     * @param password berisi password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * untuk menentukan nilai email. dan melakukan validasi pattern email
     *
     * @param email berisi email.
     */
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


    /**
     * digunakan untuk menentukan nilai tanggal lahir
     *
     * @param dob objek Date
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }

    /**
     * Digunakan untuk mencetak String pada objek Customer
     *
     */
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
    
}