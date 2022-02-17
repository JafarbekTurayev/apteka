package uz.pdp.apteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apteka.entity.Apteka;

public interface AptekaRepository extends JpaRepository<Apteka,Integer> {
    Apteka findAllByNameEquals(String name);
}
