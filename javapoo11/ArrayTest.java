package javapoo11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        float[] numbersA = new float[50];
        float[] numbersB = new float[20];
        Random random = new Random();

        for (int i = 0; i < numbersA.length; i++)
            numbersA[i] = random.nextFloat() * (1000.0f - 0.0f) + 0.0f;

        for (float num: numbersA)
            System.out.println(num);

        System.out.println();
        System.out.println("Ordenando arrelo");
        Arrays.sort(numbersA, 0, 10);

        for (int i = 0; i < 10; i++)
            numbersB[i] = numbersA[i];

        Arrays.fill(numbersB, 10, 20, 0.5f);

        System.out.println();
        System.out.println("Arreglo ordenado");
        for (float num: numbersA)
            System.out.println(num);

        System.out.println();
        System.out.println("Arreglo combinado");
        for (float num: numbersB)
            System.out.println(num);
    }
}
