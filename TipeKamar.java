
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    private String tipe;
    
    TipeKamar(String tipe)
    {
    this.tipe = tipe;
}

public String toString(){
    return tipe;
}

}

