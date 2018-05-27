package jhotel;
/**
 * Enumeration class TipeKamar - berisi tipe-tipe kamar pada JHotel.
 *
 * @author FahmiFF
 * @version 20-05-2018
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    //private String tipe_kamar;
    private String deskripsi;
    
    TipeKamar(String deskripsi)
    {
    this.deskripsi = deskripsi;
}

public String toString(){
    return deskripsi;
}

}

