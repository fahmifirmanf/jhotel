
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

   private String status;
    
    StatusKamar(String status)
    {
    this.status = status;
}

public String toString(){
    return status;
}

}
