package fabricaescuela.fabricaescuela.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fabricaescuela.fabricaescuela.core.dominio.CreditCard;
import jakarta.transaction.Transactional;

@Repository
public interface IPaymentRepository extends JpaRepository<CreditCard, Long> {
    
    @Query("SELECT c FROM CreditCard c WHERE c.number = :cardNumber")
    CreditCard findByCardNumber(long cardNumber);
    
    @Transactional
    @Modifying
    @Query("UPDATE CreditCard c SET c.saldo = c.saldo - :amount WHERE c.number = :cardNumber AND c.saldo >= :amount")
    int processPayment(long cardNumber, float amount);
}