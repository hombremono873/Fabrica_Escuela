package fabricaescuela.fabricaescuela.core.dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private long id;
    @Column(name = "number")
    private long number;
    @Column(name = "holder")
    private String holder;
    @Column(name = "expirationdate")
    private Date expirationdate;
    @Column(name = "cvc")
    private int cvc;
    @Column(name = "cupomaximo")
    private float cupomaximo;
    @Column(name="saldo")
    private float saldo;

    public CreditCard(){}

    public CreditCard(long id, long number, String holder, Date expirationdate, int cvc, float cupomaximo, float saldo) {
        this.id = id;
        this.number = number;
        this.holder = holder;
        this.expirationdate = expirationdate;
        this.cvc = cvc;
        this.cupomaximo = cupomaximo;
        this.saldo = saldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public float getCupomaximo() {
        return cupomaximo;
    }

    public void setCupomaximo(float cupomaximo) {
        this.cupomaximo = cupomaximo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}