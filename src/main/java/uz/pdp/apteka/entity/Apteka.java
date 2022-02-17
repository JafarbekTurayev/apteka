package uz.pdp.apteka.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Apteka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private  String name;

    @OneToOne
    private Address address;

    @ManyToMany
    private List<Category> categories;

    public Apteka(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
