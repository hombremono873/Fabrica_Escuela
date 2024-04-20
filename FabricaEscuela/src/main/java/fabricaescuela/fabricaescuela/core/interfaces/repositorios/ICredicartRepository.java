package fabricaescuela.fabricaescuela.core.interfaces.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;

@Repository
public interface ICredicartRepository extends JpaRepository<CreditCard, Long> {
    List<CreditCard> findByHolder(String holder);
    Optional<CreditCard> findByNumber(long number);
    void deleteByNumber(long number);
    
}

