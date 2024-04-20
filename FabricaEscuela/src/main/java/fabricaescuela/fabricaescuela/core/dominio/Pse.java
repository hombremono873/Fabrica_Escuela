package fabricaescuela.fabricaescuela.core.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pse")
public class Pse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;
    @Column(name = "account")
    private String account;
    @Column(name = "bankentity")
    private String bankentity;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "balance")
    private long balance;
    @OneToOne(mappedBy = "pse")
    private Payment payment;

    public Pse() {
    }

    public Pse(long id, String account, String bankentity, String username, String password, long balance,
            Payment payment) {
        this.id = id;
        this.account = account;
        this.bankentity = bankentity;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.payment = payment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankentity() {
        return bankentity;
    }

    public void setBankentity(String bankentity) {
        this.bankentity = bankentity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
