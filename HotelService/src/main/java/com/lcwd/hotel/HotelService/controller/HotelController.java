package com.lcwd.hotel.HotelService.controller;

import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<Hotel> (hotelService.saveHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotels(){
        return new ResponseEntity<List<Hotel>>(hotelService.getAllHotels(),HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
        return new ResponseEntity<Hotel>(hotelService.getHotel(hotelId),HttpStatus.OK);
    }
}
