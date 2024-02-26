package com.lcwd.hotel.HotelService.service;

import com.lcwd.hotel.HotelService.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    public Hotel saveHotel(Hotel hotel);

    public List<Hotel> getAllHotels();

    public Hotel getHotel(String hotelId);
}
