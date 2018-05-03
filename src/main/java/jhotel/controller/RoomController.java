package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class RoomController {
    @RequestMapping(value = "/vacantrooms")
    public  ArrayList<Room> vacantRooms(){
        //ArrayList<Room> room = DatabaseRoom.getVacantRooms();
        //return room;
        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}")
    public Room getRoom(@PathVariable ("id_hotel") int id,
                        @PathVariable ("room_no") String nomor_kamar) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id), nomor_kamar);
        return room;
    }
}
