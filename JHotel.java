
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
     Lokasi lokasi1 = new Lokasi(324, 567, "Denpasar");
     Hotel hotel1 = new Hotel("Mawar Melati", lokasi1, 87);     
     Customer customer1 = new Customer(134, "Bambang");     
     Room room1 = new SingleRoom(hotel1, "K.301", true, StatusKamar.VACANT);
     Pesanan pesan1 = new Pesanan(3, customer1, room1);
     room1.setDailyTariff(300000);
     pesan1.getBiaya();
     lokasi1.printData();
     customer1.printData();
     hotel1.printData();
     
     Administrasi.pesananDitugaskan(pesan1, room1);
     room1.printData();
     pesan1.printData();
     
    }

    
    public JHotel()
    {
       
    }
}
