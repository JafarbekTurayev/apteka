package uz.pdp.apteka.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AptekaDTO {
    private String name;
    private  String city;
    private  String district;
    private  String street;
    private  String home;



}
