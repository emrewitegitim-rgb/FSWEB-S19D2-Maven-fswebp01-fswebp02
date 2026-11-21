package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="address",schema="s19d2")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer no;
    private String city;
    private Integer country;
    private String description;
    @OneToOne(cascade = CascadeType.ALL , mappedBy = "address")
    private Customer customer;
}
