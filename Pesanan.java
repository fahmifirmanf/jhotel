
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
    private boolean isDiproses;
    private boolean isSelesai;
   
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
     * @param 
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
     /**
     * method ini digunakan untuk menampilkan status Pesanan
     *
     * @param 
     * @return true/false
     */
    public boolean getStatusDiproses()
    {
        return false;
    }
    
    
    /**
     * method ini digunakan untuk menampilkan status Pesanan Selesai atau belum
     *
     * @param 
     * @return true/false
     */public boolean getStatusSelesai()
    {
        return false;
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
    
    /**
     * method ini digunakan untuk memberitahu apakah sudah diproses atau tidak 
     *
     * @param biaya
     * @return biaya
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = diproses;
    }
    
    /**
     * method ini digunakan untuk memberitahu apakah sudah diproses atau belum
     *
     * @param biaya
     * @return biaya
     */
    public void setStatusSelesai(boolean diproses)
    {
        this.isSelesai = diproses;
    }
    
    /* 
     * 
     Method printData()
     digunakan untuk mencetak biaya
     *
    */ 
    public void printData() 
    {
        System.out.println(" Total Biaya : " +biaya); 
    }
}

