package fabricaescuela.fabricaescuela.core.dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "CreditCardId", referencedColumnName = "Id")
    private CreditCard creditCard;

    @OneToOne
    @JoinColumn(name = "PseId", referencedColumnName = "Id")
    private Pse pse;

    @ManyToOne
    @JoinColumn(name = "ReservationId", referencedColumnName = "Id")
    private Reservation reservation;

    @Column(name = "date")
    private Date date;

    @Column(name = "amount")
    private float amount;

    @Column(name = "paymentmethod")
    private String paymentmethod;

    @Column(name = "status")
    private String status;

    public Payment() {
    }

    public Payment(long id, Date date, float amount, String paymentmethod, String status) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.paymentmethod = paymentmethod;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Pse getPse() {
        return pse;
    }

    public void setPse(Pse pse) {
        this.pse = pse;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}