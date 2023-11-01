/*import java.util.Arrays;*/

import java.util.Random;

public class Bank {
    public Bank() {
        Random rnd = new Random();
        double maxExchangeRate = 0;
        String[] bankName = new String[]{"ПРИВАТБАНК", "Сенс Банк", "Сітібанк", "ІНГ Банк Україна", "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК", "Райффайзен Банк", "УКРСИББАНК", "ПУМБ", "КРЕДІ АГРІКОЛЬ БАНК", "Південний", "КРЕДОБАНК", "Банк Кредит Дніпро"};
        double[] exchangeRate = new double[14];
        int[] temp = new int[exchangeRate.length];
        for (int i = 0; i < 14; i++) {
            exchangeRate[i] = rnd.nextDouble() + rnd.nextInt(5) + 35;
        }
        int j = 0;
        for (int i = 0; i < 14; i++) {
            if (i == 0) {
                maxExchangeRate = exchangeRate[0];
            } else if (exchangeRate[i] > maxExchangeRate) {
                maxExchangeRate = exchangeRate[i];
                temp[0] = i;
            }
        }
        for (int i = 0; i < 14; i++) {
            if (exchangeRate[i] == maxExchangeRate) {
                temp[j] = i;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println("Найвигідніший курс було знайдено в банку : " + bankName[temp[i]] + ", за курсом: " + maxExchangeRate + "грн за 1$.");
        }
        /*System.out.println(Arrays.toString(exchangeRate)); *//*Контрольні стрічки*//*
        System.out.println(Arrays.toString(bankName));*/
    }

}
