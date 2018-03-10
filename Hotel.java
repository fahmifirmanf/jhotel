
/**
 * Kelas ini untuk menunjukkan informasi mengenai hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel()
    {
        // initialise instance variables
        
    }

    /**
     * method ini digunakan untuk menunjukkan informasi hotel
     *
     * @param nama, lokasi, bintang
     * @return nama, lokasi, bintang
     */
    public Hotel (String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    /**
     * method ini digunakan untuk menampilkan nilai Bintang
     *
     * 
     * @return bintang
     */
    public int getBintang()
    {
        return bintang; //menunjukkan nilai bintang
    }
    
    /**
     * method ini digunakan untuk menampilkan nama Hotel
     *
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * method ini digunakan untuk menampilkan nilai Lokasi hotel
     *
     * 
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * method ini digunakan untuk memberi nama Hotel
     *
     * 
     * @return nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * method ini digunakan untuk memberi nama Lokasi
     *
     * 
     * @return lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * method ini digunakan untuk memberi nilai bintang
     *
     * 
     * @return bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    public void printData() 
    {
        System.out.println(" Nama Hotel : " +nama); 
        System.out.println(" Lokasi : " +lokasi.getDeskripsi()); 
        System.out.println(" Bintang Hotel : " +bintang); 
    }
}
