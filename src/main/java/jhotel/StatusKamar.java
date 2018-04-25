package jhotel;
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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
