
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
    
    private String tipe_kamar;
    
    TipeKamar(String tipe_kamar)
    {
    this.tipe_kamar = tipe_kamar;
}

public String toString(){
    return tipe_kamar;
}

}

