package fabricaescuela.fabricaescuela.core.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id ;

    @Column(name="amount")
    private float amount;
    @Column(name = "status")
    private String status;
    @Column(name = "traveldetails")
    private String traveldetails;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname; 
    @Column(name = "cellphone")

    private String cellphone;
    @ManyToOne
    private Payment payment;

    public Reservation(){}
    public Reservation(long id, float amount, String status, String traveldetails, String name, String lastname,
            String cellphone) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.traveldetails = traveldetails;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTraveldetails() {
        return traveldetails;
    }
    public void setTraveldetails(String traveldetails) {
        this.traveldetails = traveldetails;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCellphone() {
        return cellphone;
    }
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    
}
