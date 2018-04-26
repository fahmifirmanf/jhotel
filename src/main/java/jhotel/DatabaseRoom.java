package jhotel;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Fahmi Firman F
 * @version 2018..4.17
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    //private static String[]  list_room;
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Constructor for objects of class DatabaseRoom
     */
    public DatabaseRoom()
    {


    }

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel() == baru.getHotel() && cari.getNomorKamar() == baru.getNomorKamar()) {
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }


    /**
     * An example of a method - replace this comment with your own
     *
     *  a sample parameter for a method
     * @return    the sum of x and y
     */

    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorKamar().equals(nomor_kamar)){
                return tes;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
    

}
