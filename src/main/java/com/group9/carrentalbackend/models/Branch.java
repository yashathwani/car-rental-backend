package com.group9.carrentalbackend.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;

//    @Basic(fetch = FetchType.LAZY)
    @OneToOne(fetch = FetchType.LAZY)
    private Employee manager;
    private String phoneNumber;
    private String email;
}
