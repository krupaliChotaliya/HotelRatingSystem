package com.lcwd.user.service.UserService.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Hotel {
    private String id;
    private String name;
    private String location;
    private String about;
}
