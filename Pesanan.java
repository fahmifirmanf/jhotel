
/**
 * Kelas ini untuk menunjukkan informasi mengenai Pemesanan Kamar Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
   
    public Pesanan( )
   {
    }
    
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }

    
    
    /**
     * method ini digunakan untuk menampilkan biaya
     *
     * 
     * @return biaya 
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * method ini digunakan untuk menampilkan info pelanggan
     *
     * 
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
        
      
     /**
     * method ini digunakan untuk menampilkan status Pesanan
     *
     * 
     * @return true/false
     */
    public boolean getStatusDiproses()
    {
        return false;
    }
    
    
    /**
     * method ini digunakan untuk menampilkan status Pesanan Selesai atau belum
     *
     * 
     * @return true/false
     */public boolean getStatusSelesai()
    {
        return false;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * method ini digunakan untuk memberikan jumlah biaya
     *
     * @param biaya
     * @return biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * method ini digunakan untuk memberikan informasi Customer
     *
     * @param biaya
     * @return biaya
     */
    public void setPelanggan(Customer baru)
    {
        this.pelanggan = baru;
    }
    
     public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    
     public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
    }
    
    /**
     * method ini digunakan untuk memberitahu apakah sudah diproses atau tidak 
     *
     * @param diproses
     * @return diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = diproses;
    }
    
    /**
     * method ini digunakan untuk memberitahu apakah sudah diproses atau belum
     *
     * @param diproses
     * @return diproses
     */
    public void setStatusSelesai(boolean diproses)
    {
        this.isSelesai = diproses;
    }
    
     public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /* *
     * 
     * Method printData()
     digunakan untuk mencetak biaya
     *
    */ 
    public void printData() 
    {
        System.out.println(" Nama Pelanggan : " +pelanggan.getNama()); 
        System.out.println(" Tipe Kamar : " +tipe_kamar);
        System.out.println(" Status Diproses : " +isDiproses);
        System.out.println(" Status Selesai : " +isSelesai); 
    }
}

