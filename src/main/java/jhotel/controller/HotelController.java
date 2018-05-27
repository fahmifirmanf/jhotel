package jhotel.controller;
import org.springframework.web.bind.annotation.*;
import jhotel.*;

import java.util.ArrayList;

@RestController
/**
 * Kelas ini mengatur dari sisi server dan sisi client saat pengambilan data hotel.
 *
 * @author Fahmi FF
 * @version 20-05-2018
 */
public class HotelController {


    /**
     * method hini mengatur sisi server untuk Database Hotel.
     */
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public  ArrayList<Hotel> hotelsList(){
      //ArrayList<Hotel> hotel = DatabaseHotel.getHotelDatabase();
      //return hotel;
        return DatabaseHotel.getHotelDatabase();
    }

    /**
     * method ini mengatur sisi server untuk pengambilan data hotel berdasarkan id dari hotel..
     *
     * @param id_hotel
     */
    @RequestMapping(value = "/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel) {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}
