package com.chakarapani.base.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@SuppressWarnings("unused")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(name = "EmailConstraint", columnNames = "email"), @UniqueConstraint(name = "UsernameConstraint", columnNames = "username")})
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, columnDefinition = "uuid")
    private UUID id;

    @Column(name = "username")
    @JsonProperty("username")
    private String username;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    @Column(name = "last_name")
    private String lastName;

    @JsonProperty("dob")
    @Column(name = "dob")
    private LocalDate dateOfBirth;

    @Transient
    @JsonProperty("age")
    @Column(name = "age")
    private Integer age;

    @JsonProperty("email")
    @Column(name = "email")
    private String email;

    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}