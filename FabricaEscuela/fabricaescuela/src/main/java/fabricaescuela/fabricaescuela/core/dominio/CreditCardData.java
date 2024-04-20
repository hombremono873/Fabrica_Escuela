package fabricaescuela.fabricaescuela.core.dominio;

public class CreditCardData {
    public static CreditCardTest[] generateSampleData() {
        CreditCardTest[] cards = new CreditCardTest[5];
        cards[0] = new CreditCardTest("1111222233334444", "Pedro José", "12/25", 123, 5000.0f, 2500.0f);
        cards[1] = new CreditCardTest("5555666677778888", "Omar alberto", "10/24", 456, 10000.0f, 7500.0f);
        cards[2] = new CreditCardTest("9999888877776666", "Martha", "08/23", 789, 7500.0f, 3000.0f);
        cards[3] = new CreditCardTest("1234123412341234", "Daniela", "06/22", 321, 2000.0f, 1500.0f);
        cards[4] = new CreditCardTest("9876987698769876", "María Jessica", "04/21", 654, 3000.0f, 2000.0f);
        return cards;
    }

}