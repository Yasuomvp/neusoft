package com.neu.jpa.entity;


import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;


    private String password;


    private String about;

    @OneToMany(
            targetEntity = Car.class,
            fetch = FetchType.EAGER,
            cascade = CascadeType.REFRESH
    )
    private List<Car> car;


}
