package jhotel;
/**
 * Class ini digunakan untuk melakukan sistem administrasi
 *
 * @author Fahmi Firman F
 * @version 10-03-2017
 */

public class Administrasi
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *   a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if(pesan != null && kamar != null)
        {
            if(kamar.getStatusKamar() == StatusKamar.VACANT)
            {
                pesan.setStatusSelesai(false);
                pesan.setStatusDiproses(true);
                pesan.setRoom(kamar);

                roomAmbilPesanan(pesan, kamar);
            }
            else
            {
                pesan.setStatusAktif(false);
            }

        }
        }



    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }

    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
    }
    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
   
    }
    */

    /*
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    */
    
    public static void pesananDibatalkan(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);  
        pesan.setStatusAktif(false);     
        //pesan.setRoom(null);
        roomLepasPesanan(kamar);
        //kamar.getPesanan().setStatusAktif(false);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        //Pesanan pesan = //kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //pesan.setRoom(null);
        //kamar.setPesanan(null);
        //roomLepasPesanan(kamar);
        //kamar.getPesanan().setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.VACANT);
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //pesan.setRoom(null);
        //pesan.getPesanan().setStatusAktif(false);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        //pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //pesan.setRoom(null);
        //pesan.getPesanan().setStatusAktif(false);
    }
}
