package jhotel;
/**
 * Class ini digunakan untuk melakukan sistem administrasi
 *
 * @author Fahmi Firman F
 * @version 20-05-2018
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
     * Digunakan ntuk melakukan proses pemesanan kamar
     *
     * @param pesan berisi objek Pesanan
     * @param kamar berisi objek Room
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

    /**
     * Digunakan untuk melakukan pembatalan pesanan.
     *
     * @param kamar berisi objek Room
     */
    public static void pesananDibatalkan(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);  
        pesan.setStatusAktif(false);
        roomLepasPesanan(kamar);

    }

    /**
     * Digunakn untuk menyelesaikan pesanan
     *
     * @param kamar berisi objek Room
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.VACANT);
    }

    /**
     * Digunakan untuk melakukan pembatalan pesanan.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }

    /**
     * Digunakan untuk menandakan pesanan telah selesai.
     *
     * @param pesan berisi objek Pesanan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
}
