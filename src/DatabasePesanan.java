import java.util.ArrayList;

/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Pesanan Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class DatabasePesanan
{
    //private static String[] list_pesanan;
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    public DatabasePesanan()
    {
               
    }

    public static ArrayList<Pesanan> getPesananDatabase()
    {

    }

    public static int getLastPesananID()
    {

    }
    
    /**
     * method ini digunakan untuk menambah pesanan baru
     * 
     *
     * @param baru
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                return false;
            }
            else
            {
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getId() == id)
            {
                return pesanan;
            }
        }

        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar))
            {
                return pesanan;
            }
        }

        return null;
    }



    /**
     * method ini digunakan untuk menghapus pesanan
     * 
     *
     * @param pesan
     * @return false
     */

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }

        return null;
    }
    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        return false;
    }



    /**
     * method ini digunakan untuk mendapat Pesanan 
     *
     * @param cust
     * @return pesan
     */
    /*public static Pesanan getPesanan(Customer cust)
    {
        
        return null;
    }
    */
    
    /*public static String[] getPesananDatabase()
    {
        return null; 
    } 
    */
    /**
     * method ini digunakan untuk pesanan dibatalkan
     *
     * @param pesan
     * 
     */
    /*public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }
    */
}
