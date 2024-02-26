package com.lcwd.hotel.HotelService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "hotels")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}
