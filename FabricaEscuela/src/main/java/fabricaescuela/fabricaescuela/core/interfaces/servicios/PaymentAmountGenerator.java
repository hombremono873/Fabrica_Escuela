package fabricaescuela.fabricaescuela.core.interfaces.servicios;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PaymentAmountGenerator {

    private static final int ARRAY_SIZE = 100;
    private static final float MIN_AMOUNT = 1000.0f;
    private static final float MAX_AMOUNT = 2000000.0f;

    private final float[] amounts = generateRandomAmounts();

    private float[] generateRandomAmounts() {
        float[] amounts = new float[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            amounts[i] = MIN_AMOUNT + random.nextFloat() * (MAX_AMOUNT - MIN_AMOUNT);
        }
        return amounts;
    }

    public float getRandomAmount() {
        Random random = new Random();
        int index = random.nextInt(ARRAY_SIZE);
        return amounts[index];
    }
}