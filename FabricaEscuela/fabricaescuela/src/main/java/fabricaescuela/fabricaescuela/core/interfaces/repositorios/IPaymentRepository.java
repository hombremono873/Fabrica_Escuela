package fabricaescuela.fabricaescuela.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fabricaescuela.fabricaescuela.core.dominio.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Long> {

}
