package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class RoomController {
    @RequestMapping(value = "/vacantrooms")
    public  ArrayList<Room> vacantRooms(){
        ArrayList<Room> room = DatabaseRoom.getRoomDatabase();
        return room;
    }

    @RequestMapping(value ="/getcustomer/{id_hotel}/{room_no}",  method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel, String nomor_kamar) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room;
    }
}
