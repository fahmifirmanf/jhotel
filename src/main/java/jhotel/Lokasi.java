package jhotel;
/**
 * Kelas ini untuk menunjukkan informasi mengenai lokasi atau Alamat Hotel
 *
 * @author Fahmi Firman F
 * @version 01-03-2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    

    
    
    /**
     * method ini digunakan untuk menubjukkan lokasi hotel
     *
     * @param x_coord, y_coord, deskripsiLokasi
     * @return x_coord, y_coord, deskripsiLokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
       this.x_coord = x_coord;
       this.y_coord = y_coord;
       this.deskripsiLokasi = deskripsiLokasi;
    }
    
    /**
     * method ini digunakan untuk mendapat nilai Xcoord
     *
     * 
     * @return x_coord
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * method ini digunakan untuk mendapat nilai Ycoord
     *
     * 
     * @return y_coord
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * method ini digunakan untuk mendapat nilai Deskripsi okasi
     *
     * 
     * @return deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
     * method ini digunakan untuk memberi nilai Xcoord
     *
     * @param x_coord
     * @return x_coord
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
        
    /**
     * method ini digunakan untuk memberi nilai Ycoord
     *
     * @param y_coord
     * @return y_coord
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    /**
     * method ini digunakan untuk memberi nilai deskripsi
     *
     * @param deskripsi
     * @return deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        this.deskripsiLokasi = deskripsi;
    }
    
    
    public String toString()
    {
        return "\nKoordinat X : " + x_coord +
               "\nKoordinat Y : " + y_coord +                
               "\nDeskripsi Lokasi : " + deskripsiLokasi;
    }
    
    
    /*public void printData() 
    {
        System.out.println(" Koordinat X : " +x_coord); 
        System.out.println(" Koordinat Y : " +y_coord); 
        System.out.println(" Deskripsi Alamat : " +deskripsiLokasi); 
    }
    */
}
