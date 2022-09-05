package com.chakarapani.base.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

// Address Entity with all getter setter and constructors with proper json mapping in the response value
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    @JsonIgnore
    private UUID id;

    @Column(name = "house_no")
    @JsonProperty(value = "house_no")
    private String houseNo;

    @Column(name = "street")
    @JsonProperty(value = "street")
    private String street;

    @Column(name = "city")
    @JsonProperty(value = "city")
    private String city;

    @Column(name = "country")
    @JsonProperty(value = "country")
    private String country;


    @Column(name = "postal_code")
    @JsonProperty(value = "postal_code")
    private String postalCode;

}
