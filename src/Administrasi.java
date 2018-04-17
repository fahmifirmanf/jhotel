
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
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan,kamar);
        
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        //kamar.setPesanan(pesan);
   
    }
    
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        //kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = //kamar.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);       
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
        //kamar.getPesanan().setStatusAktif(false);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = //kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
        //kamar.setPesanan(null);
        roomLepasPesanan(kamar);
        //kamar.getPesanan().setStatusAktif(false);
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        //pesan.getPesanan().setStatusAktif(false);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        //pesan.getPesanan().setStatusAktif(false);
    }
}
