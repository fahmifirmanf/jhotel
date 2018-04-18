import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.GregorianCalendar;

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
        /*
        Customer A = new Customer("a", 9, 4,2018);
        DatabaseCustomer.addCustomer(A);
        Customer B = new Customer("b", 8, 4,2018);
        DatabaseCustomer.addCustomer(B);
        System.out.println("Data pada Database Customer");
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        */

     /*
     modul 5
     Customer cust3 = new Customer(12,"Bambang",new GregorianCalendar (2002,03,10).getTime()); 
     //cust3.getDOB();
     */
     /*
     Customer cust4 = new Customer(12,"Bambang",new GregorianCalendar (2002,03,10).getTime()); 
     System.out.println(cust4.getDOB());
     */
     /*
        System.out.println("Welcome to JHotel");
     Lokasi lokasi = new Lokasi(324, 567, "Denpasar");
     Hotel hotel = new Hotel("Mawar Melati", lokasi, 87);     
     Customer customer = new Customer(134, "Bambang");     
     Room single = new SingleRoom(hotel, "K.301", true, StatusKamar.VACANT);
     Pesanan pesan = new Pesanan(3, customer, single);
     single.setDailyTariff(300000);
     pesan.setBiaya();
     //print data lokasi customer hotel
     lokasi.printData();
     //customer.printData();
     hotel.printData();
     
     //cek method di administrasi
     Administrasi.pesananDitugaskan(pesan, single);
     //pesan.printData();
     single.printData();    
     
     if (single instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        } else  System.out.println("Salah, bukan Double Room");
     
     Room doubleroom = new DoubleRoom(hotel, "S.907", true, StatusKamar.BOOKED);
     Pesanan pesan2 = new Pesanan(436, customer,doubleroom); 
     
     doubleroom.setDailyTariff(600000);
     pesan2.setBiaya();        
    
     Administrasi.pesananDitugaskan(pesan2, doubleroom);
     //pesan2.printData();
     doubleroom.printData();
        
     if (doubleroom instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        } else  System.out.println("Salah, bukan Double Room");
     
     
     
      /*System.out.println("\n Method 2 pesananDibatalkan(kamar)");
        Administrasi.pesananDibatalkan(kamar);
        pesan.printData();
        kamar.printData();
        
        //assign room ulang
        Administrasi.pesananDitugaskan(pesan, kamar);
        System.out.println("\n Method 3 pesananDibatalkan(pesan) ");
        Administrasi.pesananDibatalkan(pesan);
        pesan.printData();
        kamar.printData();
        
        //assign room ulang
        Administrasi.pesananDitugaskan(pesan, kamar);
        System.out.println("\n Method 4 pesananSelesai(kamar) ");
        Administrasi.pesananSelesai(kamar);
        pesan.printData();
        kamar.printData();
        
        //assign room ulang
        Administrasi.pesananDitugaskan(pesan, kamar);
        System.out.println("\nMethod 5 pesananSelesai(pesan) ");
        Administrasi.pesananSelesai(pesan);
        */
        //pesan.printData();
        //kamar.printData();
    }

    
    public JHotel()
    {
       
    }
}
