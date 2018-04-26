package jhotel;
import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.util.GregorianCalendar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JHotel
{
  
    /**
     * method ini digunakan untuk menjalankan perintah main
     * id
     *
     *
     * 
     */

    public static void main (String args[])
    {
        try{
            DatabaseHotel.addHotel(new Hotel("Kebun Hijau", new Lokasi(100, 102, "Lamongan Utara"), 6));
            DatabaseHotel.addHotel(new Hotel("Makmur Jaya", new Lokasi(182, 193, "Bandung Selatan"), 5));
        }
        catch(HotelSudahAdaException b)
        {
            b.getPesan();
        }

        try
        {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "K.301"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "K.102"));
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "S.123"));
        }
        catch(RoomSudahAdaException b)
        {
            b.getPesan();
        }

        SpringApplication.run(JHotel.class, args);
    }

    public JHotel()
    {
        // initialise instance variables
    }
        //System.out.println(" Implementasi Exception ");
        //SpringApplication.run(JHotel.class, args);
        /*
        Modul 7
        try {

            DatabaseCustomer.addCustomer(new Customer("Sasa", 12, 04, 2000, "sasa@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Lala", 13, 05, 1990, "lala@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Nana", 16, 06, 1997, "lala@gmail.com"));

        }
        catch (PelangganSudahAdaException coba1){
            System.out.println(coba1.getPesan());
        }

        /*
        Hotel hotel1 = new Hotel ("Sakura", new Lokasi(1, 2, "Jakarta"), 6);
        Hotel hotel2 = new Hotel ("Melati", new Lokasi(7, 19, "Depok"), 5) ;
        Hotel hotel3 = new Hotel ("Kamboja", new Lokasi(185, 125, "Bandung"), 4);
        Hotel hotel4 = new Hotel ("Sakura", new Lokasi(1, 2, "Jakarta"), 5);

        try {
            DatabaseHotel.addHotel(hotel1);
            DatabaseHotel.addHotel(hotel2);
            DatabaseHotel.addHotel(hotel3);
            DatabaseHotel.addHotel(hotel4);
        }

        catch (HotelSudahAdaException coba2){
            System.out.println(coba2.getPesan());
        }
        */
        /* coba tes
        Customer A = new Customer("Ani", 17, 4,2008, "ibuani@gmail.com");
        Customer B = new Customer("Bambang", 18, 5,2000, "pakbambang@gmail.com");
        Customer C = new Customer("Cantik", 12, 12,2012, "akucantik@gmail.com");
        try {
            DatabaseCustomer.addCustomer(A);
        } catch (PelangganSudahAdaException tes){
            System.out.println(tes.getPesan());
        }
        try {
            DatabaseCustomer.addCustomer(B);
        } catch (PelangganSudahAdaException tes){
            System.out.println(tes.getPesan());
        }
        try {
            DatabaseCustomer.addCustomer(C);
        } catch (PelangganSudahAdaException tes){
            System.out.println(tes.getPesan());
        }
        Lokasi lok1 = new Lokasi(12,13,"Jakarta");
        Lokasi lok2 = new Lokasi(123,132,"Lamongan");
        Lokasi lok3 = new Lokasi(132,123,"Bandungan");

        Hotel D = new Hotel("Sakura", lok1, 5);
        Hotel E = new Hotel("Kamboja", lok2, 4);
        Hotel F = new Hotel("Kenanga", lok3, 3);
        Hotel G = new Hotel("Mawar", lok2, 5);
        try {
            DatabaseHotel.addHotel(D);
        } catch (HotelSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseHotel.addHotel(E);
        } catch (HotelSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseHotel.addHotel(F);
        } catch (HotelSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseHotel.addHotel(G);
        } catch (HotelSudahAdaException test){
            System.out.println(test.getPesan());
        }

        Room H = new SingleRoom(D, "K301");
        Room I = new DoubleRoom(E, "K401");
        Room J = new SingleRoom(F, "K501");
        Room K = new DoubleRoom(G, "K601");
        try {
            DatabaseRoom.addRoom(H);
        } catch (RoomSudahAdaException test){
            System.out.println(test.getPesan());
        }
        Room Z = new SingleRoom(D, "K301");
        try {
            DatabaseRoom.addRoom(Z);
        } catch (RoomSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseRoom.addRoom(I);
        } catch (RoomSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseRoom.addRoom(J);
        } catch (RoomSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabaseRoom.addRoom(K);
        } catch (RoomSudahAdaException test){
            System.out.println(test.getPesan());
        }

        Pesanan L  = new Pesanan(12, A);
        Pesanan M  = new Pesanan(5, B);
        Pesanan N  = new Pesanan(6, C);
        try {
            DatabasePesanan.addPesanan(L);
        } catch (PesananSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(L);
        } catch (PesananSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(M);
        } catch (PesananSudahAdaException test){
            System.out.println(test.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(N);
        } catch (PesananSudahAdaException test){
            System.out.println(test.getPesan());
        }

        // Tes PelangganTidakDitemukanException
        System.out.println("Test PelangganTidakDitemukanException");
        try {
            DatabaseCustomer.removeCustomer(6);
        } catch (PelangganTidakDitemukanException test){
            System.out.println(test.getPesan());
        }

        // Tes PesananTidakDitemukanException
        System.out.println("Test PesananTidakDitemukanException");
        try {
            DatabasePesanan.removePesanan(B);
        } catch (PesananTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }

        System.out.println("Test RoomTidakDitemukanException");
        try {
            DatabaseRoom.removeRoom(E, "S201");
        } catch (RoomTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }

        System.out.println("Test HotelTidakDitemukanException");
        try {
            DatabaseHotel.removeHotel(6);
        } catch (HotelTidakDitemukanException test) {
            System.out.println(test.getPesan());
        }

        for (Customer lili : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(A);
            System.out.println(B);
        }

        for (Hotel nini : DatabaseHotel.getHotelDatabase())
        {
            System.out.println(D);
            System.out.println(E);
            System.out.println(F);
            System.out.println(G);
        }

        */

        /*
        for (Room mimi : DatabaseRoom.getRoomDatabase())
        {
            System.out.println(H);
            System.out.println(I);
            System.out.println(J);
            System.out.println(K);
        }
        */





        /*
        modul 6
        DatabaseCustomer.addCustomer(new Customer("sasa", 12, 04, 2000));
        DatabaseCustomer.addCustomer(new Customer("lala", 13, 05, 1990));
        DatabaseCustomer.addCustomer(new Customer("nana", 14, 5,2004));
        DatabaseHotel.addHotel(new Hotel ("Sakura", new Lokasi(1, 2, "Jakarta"), 6));
        DatabaseHotel.addHotel(new Hotel ("Melati", new Lokasi(23, 56, "Bandung"), 5));
        DatabaseHotel.addHotel(new Hotel ("Kamboja", new Lokasi(45, 67, "Depok Utara"), 4));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "k.301"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "s.501"));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(3), "S.201"));

        for (Customer lili : DatabaseCustomer.getCustomerDatabase())
    {
        System.out.println(lili);
    }


        for (Hotel yeye : DatabaseHotel.getHotelDatabase())
        {
            System.out.println(yeye);
        }


        for (Room nenek : DatabaseRoom.getRoomDatabase())
        {
            System.out.println(nenek);
        }

        DatabasePesanan.addPesanan(new Pesanan(14, DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(10, DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(8, DatabaseCustomer.getCustomer(3)));

        for (Pesanan kakek : DatabasePesanan.getPesananDatabase())
        {
            System.out.println(kakek);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "K301"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "S202"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(3), "A1"));
        for (Pesanan saya : DatabasePesanan.getPesananDatabase())
        {
            System.out.println(saya);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));
        for (Pesanan kita : DatabasePesanan.getPesananDatabase())
        {
            System.out.println(kita);
        }
        */
        /*odul 5
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

       //dministrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1, "k.301")));
        }

