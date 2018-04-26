package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class RoomController {
    public  ArrayList<Room> vacantRooms(){
        ArrayList<Room> room = DatabaseRoom.getRoomDatabase();
        return room;
    }

    @RequestMapping("/getcustomer/{hotel_id}/{room_no}")
    public Room getRoom(@PathVariable int id_hotel, String nomor_kamar) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room;
    }
}
