package com.lcwd.hotel.HotelService.service.Impl;

import com.lcwd.hotel.HotelService.Exception.ResourceNotFoundException;
import com.lcwd.hotel.HotelService.entities.Hotel;
import com.lcwd.hotel.HotelService.repository.HotelRepository;
import com.lcwd.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        hotel.setId(UUID.randomUUID().toString());
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel is not found for this "+hotelId));
    }
}
