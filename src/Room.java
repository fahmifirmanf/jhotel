
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel; 
    private String nomor_kamar;
    //private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    //private Pesanan pesan;
    
    
    /**
     * Constructor for objects of class Room
     */
    /* perubahan pada modul 6
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;        
        this.status_kamar = status_kamar;
    }
    */

    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        //this.status_kamar = status_kamar;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    
    
        public Hotel getHotel()
    {
        return hotel; 
    }// put your code here
        
        
      public String getNomorKamar()
    {
        return nomor_kamar; 
    }
    
      /*public boolean getStatusAvailable()
    {
        return isAvailable; 
    }
    */
        
      public double getDailyTariff()
    {
        return dailyTariff; 
    }
    
      public StatusKamar getStatusKamar()
    {
        return status_kamar; 
    }
    
     /* public Pesanan getPesanan()
    {
        return pesan; 
    }
    */
    
    public abstract TipeKamar getTipeKamar();
          
    
    
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
   

    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
    /*public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    */
        
    
    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar;
        }
        else{
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar().toString() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar +
                    "\nPelanggan   : " + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }
    }
    
    /*public void printData()
    {
    System.out.println(" Nama Hotel : " +hotel.getNama());
    System.out.println(" Nomor Kamar : " +nomor_kamar); 
    System.out.println(" Status Ketersediaan : " +isAvailable); 
    System.out.println(" Harga : " +dailyTariff);
    System.out.println(" Status Kamar : " +status_kamar); 
    System.out.println("Tipe Kamar  : "+getTipeKamar());
    }
    */
}
