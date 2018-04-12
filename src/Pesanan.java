import java.util.Date;
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
    private Date tanggalPesan;
    private int id;
    private boolean isAktif;

   /*
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar,
                    int tanggal, int bulan, int tahun)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff()*jumlahHari;
        tanggalPesan = new Date(tahun, bulan, tanggal);
    }


    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar,
                    Date tanggalPesan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff()*jumlahHari;
        this.tanggalPesan = tanggalPesan;
    }
    */
    
    /**
     * method ini digunakan untuk menampilkan biaya
     *
     * 
     * @return biaya 
     */
    public Pesanan(double jumlahHari, Customer pelanggan )
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        isAktif = true;
        tanggalPesan = new Date();
        biaya = kamar.getDailyTariff() * jumlahHari;
        id = DatabasePesanan.getLastPesananID() + 1;
    }

    public int getID()
    {
        return id;
    }

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
    
    public boolean getStatusAktif()
    {
        return isAktif;
    }
      
     /**
     * method ini digunakan untuk menampilkan status Pesanan
     *
     * 
     * @return true/false
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    
    /**
     * method ini digunakan untuk menampilkan status Pesanan Selesai atau belum
     *
     * 
     * @return true/false
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    /**
     * method ini digunakan untuk memberikan jumlah biaya
     *
     *
     * @return biaya
     */
    public void setID()
    {
     this.id = id;
    }

    public void setBiaya()
    {
       biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    
    /**
     * method ini digunakan untuk memberikan informasi Customer
     *
     *
     * @return biaya
     */
    public void setPelanggan(Customer pelanggan) //atau customer baru
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
     *
     * @return diproses
     */
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
    }

    public void setStatusAktif(boolean aktif)
    {
        this.isAktif = aktif;
    }

     public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    public void setTangalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    public String toString(){
        String final_status = "KOSONG";
        
        if (isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }
        
        return "Dibuat Oleh " +pelanggan.getNama() +
                ".Proses booking untuk" +kamar.getHotel()+
                "Kamar Nomor " + kamar.getNomorKamar()+
                "dengan tipe kamar yang diinginkan "+kamar.getTipeKamar()+
                ". Status :" +final_status+ ".";
    }
    
    
    /* *
     * 
     * Method printData()
     digunakan untuk mencetak biaya
     *
     
    public void printData() 
    {
        System.out.println(" Nama Pelanggan : " +pelanggan.getNama()); 
        System.out.println(" Status Diproses : " +isDiproses);
        System.out.println(" Status Selesai : " +isSelesai); 
        System.out.println(" Jumlah Hari : " +jumlahHari);
        System.out.println(" Biaya : " +biaya); 
        
    }
    */
}

