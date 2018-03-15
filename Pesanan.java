
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
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
   
   
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.biaya = (kamar.getDailyTariff())*jumlahHari;
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
    
    public double getJumlahHari()
    {
        return jumlahHari;
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
    public void setBiaya()
    {
       this.biaya = (kamar.getDailyTariff())*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    
    /**
     * method ini digunakan untuk memberikan informasi Customer
     *
     * @param biaya
     * @return biaya
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
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
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
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
        System.out.println(" Status Diproses : " +isDiproses);
        System.out.println(" Status Selesai : " +isSelesai); 
        System.out.println(" Jumlah Hari : " +jumlahHari);
        System.out.println(" Biaya : " +biaya); 
        
    }
}

