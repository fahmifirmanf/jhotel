
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

