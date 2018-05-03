package jhotel.controller;
import org.springframework.web.bind.annotation.*;
import jhotel.*;

import java.util.ArrayList;

@RestController
public class HotelController {
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public  ArrayList<Hotel> hotelsList(){
      //ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
      //return hotel;
        return DatabaseHotel.getHotelDatabase();
    }

    @RequestMapping(value = "/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel) {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}
