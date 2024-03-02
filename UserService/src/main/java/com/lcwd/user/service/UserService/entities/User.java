package com.lcwd.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro_user")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String uid;
    @Column(name = "about")
    private String about;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;

    @Transient
    private List<Rating> ratings=new ArrayList<>();


}
