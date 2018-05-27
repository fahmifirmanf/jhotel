package jhotel;
/**
 * Enumeration class StatusKamar - berisi status-status kamar pada JHotel.
 *
 * @author FahmiFF
 * @version 20-05-2018
 */
public enum StatusKamar
{
BOOKED("Booked"),
PROCESSED("Processed"),  
VACANT("Vacant");

//private String status_kamar;
private String deskripsi;
    
    StatusKamar(String deskripsi)
    {
    this.deskripsi = deskripsi;
}

public String toString(){
    return deskripsi;
}

}
