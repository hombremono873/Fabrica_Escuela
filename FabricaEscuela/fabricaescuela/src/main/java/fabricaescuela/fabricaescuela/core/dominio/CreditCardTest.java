package fabricaescuela.fabricaescuela.core.dominio;

public class CreditCardTest {
    private String number;
    private String holder;
    private String expirationDate;
    private int cvc;
    private float cupomaximo;
    private float saldo;

    public CreditCardTest(String number, String holder, String expirationDate, int cvc, float cupomaximo, float saldo) {
        this.number = number;
        this.holder = holder;
        this.expirationDate = expirationDate;
        this.cvc = cvc;
        this.cupomaximo = cupomaximo;
        this.saldo = saldo;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
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
