
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

   private String status_kamar;
    
    StatusKamar(String status_kamar)
    {
    this.status_kamar = status_kamar;
}

public String toString(){
    return status_kamar;
}

}
