package jhotel.controller;
import org.springframework.web.bind.annotation.*;
import jhotel.*;

import java.util.ArrayList;

public class HotelController {
    public  ArrayList<Hotel> hotelsList(){
      ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
      return hotel;
    }

    @RequestMapping("/getcustomer/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel) {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}
