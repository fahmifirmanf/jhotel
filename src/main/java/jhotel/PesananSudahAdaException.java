package jhotel;

/**
 * class  untuk exception Pesanan sudah ada.
 *
 * @author Fahmi FF
 * @version 20-05-2018
 */
public class PesananSudahAdaException extends Exception{
    private Pesanan pesanan_error;

    /**
     * constructor untuk kelas PesananSudahAdaException
     *
     * @param pesanan_input objek Pesanan
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh : ");
        pesanan_error=pesanan_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan ";
    }
}
