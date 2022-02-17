package uz.pdp.apteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.apteka.entity.Address;
import uz.pdp.apteka.entity.Apteka;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
