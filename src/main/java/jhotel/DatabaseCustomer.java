package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Customer Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class DatabaseCustomer {
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID() == baru.getID() || tes.getEmail().equals(baru.getEmail())) {
                throw new PelangganSudahAdaException(baru);
            }

        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }


    /**
     * method ini digunakan untuk menghapus customer dari database berdasarkan
     * id
     *
     * @param id
     * @return false
     */
    public static Customer getCustomer(int id) {
        for(Customer pelanggan : CUSTOMER_DATABASE)
        {
            if(pelanggan.getID() == id)
            {
                return pelanggan;
            }
        }

        return null;
    }

    public static Customer getCustomerLogin(String email, String password) {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getEmail().equals(email)  && tes.getPassword().equals(password)){
                return tes;
            }
        }
        return null;

    }

        public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
        {
            for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
                Customer tes = CUSTOMER_DATABASE.get(i);
                if (tes.getID()==id){
                    Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                    try {
                        DatabasePesanan.removePesanan(tes);
                    } catch (PesananTidakDitemukanException test){
                        System.out.println(test.getPesan());
                    }
                    if(CUSTOMER_DATABASE.remove(tes))
                    {
                        return true;
                    }
                }
            }
            throw new PelangganTidakDitemukanException(id);
        }

    }

    
    /**
     * method ini digunakan untuk mencari customer di database
     *
     * 
     * @return list_customer
     */


