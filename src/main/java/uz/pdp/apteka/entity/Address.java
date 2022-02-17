package uz.pdp.apteka.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private  String city;

    @Column(nullable = false)
    private  String district;

    @Column(nullable = false)
    private  String street;

    @Column(nullable = false)
    private  String home;

    public Address(String city, String district, String street, String home) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.home = home;
    }
}
