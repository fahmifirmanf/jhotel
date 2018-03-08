
public class JHotel
{
  
    /**
     * method ini digunakan untuk menjalankan perintah main
     * id
     *
     * @param args[]
     * 
     */
    public static void main (String args[])
    {
     Customer lala = new Customer(1, "lala"); 
     Lokasi kampung = new Lokasi(314, 678, "Surabaya Utara" );
     Hotel Dua = new Hotel("Semut", kampung, 50);
     Pesanan Tiga = new Pesanan(3000000, lala);     
     lala.setNama("farhan");
     Tiga.printData();
     lala.printData();
     DatabasePesanan.addPesanan(Tiga);
     DatabaseCustomer.addCustomer(lala);
     
     
     
    }

    
    public JHotel()
    {
       
    }
}
