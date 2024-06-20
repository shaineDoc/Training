package com.YarikTask.Desktop;

import java.util.Random;
import java.util.Scanner;

public class Saske extends Ninja{
    Double damage;

    public Saske(Double chakra, Double health) {
        super(chakra, health);
    }

    Scanner scanner = new Scanner(System.in);



    public double[] sharingan() {
        Random random = new Random();
        double damage = 400 + (100 * random.nextDouble()); // Случайное значение в диапазоне от 20 до 150
        double fixedValueChakra = 230.55d;
        return new double[]{damage, fixedValueChakra};

    }

    public double[] katon() {
        Random random = new Random();
        double damage = 20 + (100 * random.nextDouble()); // Случайное значение в диапазоне от 20 до 150
        double fixedValueChakra = 150.05d;
        return new double[]{damage, fixedValueChakra};

    }

    public double[] chidori() {

        Random random = new Random();
        double damage = 20 + (100 * random.nextDouble()); // Случайное значение в диапазоне от 20 до 150
        double fixedValueChakra = 350.99d;
        return new double[]{damage, fixedValueChakra};
    }

    public double atack() {
        System.out.println("Please, enter name jutsu for atack : \n 1. CHIDORI \n 2.KATON \n 3. SHARINGAN ?" );
        String jutsu = scanner.nextLine();
        while (true) {
            if (jutsu.equalsIgnoreCase("chidori " ) || jutsu.equals(String.valueOf(1))){
                double[] chidoriResult = chidori();
                double chakraСonsumption = chidoriResult[0];
                double fixedValue = chidoriResult[1];
                if (chakra >= 200) {
                    chakra -= fixedValue;
                    System.out.println("Used chidori! Damage: " + chakraСonsumption + ", Fixed Value: " + fixedValue + ", Remaining chakra: " + chakra);
                    damage = chakraСonsumption;
                    break;
                } else {
                    System.out.println("Nooo, you chakra is gone!");
                }
            } else if (jutsu.equalsIgnoreCase("katon" )|| jutsu.equalsIgnoreCase(String.valueOf(2))) {
                double[] katonResult = katon();
                double chakraСonsumption = katonResult[0];
                double fixedValue = katonResult[1];
                if (chakra >= 200) {
                    chakra -= fixedValue;
                    System.out.println("Used katon! Damage: " + chakraСonsumption + ", Fixed Value: " + fixedValue + ", Remaining chakra: " + chakra);
                    damage = chakraСonsumption;
                    break;
                } else {
                    System.out.println("Nooo, your chakra is gone!");
                }
            } else if (jutsu.equalsIgnoreCase("sharingan")|| jutsu.equals(String.valueOf(3))) {
                double[] sharinganResult = sharingan();
                double chakraСonsumption = sharinganResult[0];
                double fixedValue = sharinganResult[1];
                if (chakra >= 200) {
                    chakra -= fixedValue;
                    System.out.println("Used sharingan! Damage: " + chakraСonsumption + ", Fixed Value: " + fixedValue + ", Remaining chakra: " + chakra);
                    damage = chakraСonsumption;
                    break;
                } else {
                    System.out.println("Nooo, you chakra is gone! ");
                }
            } else {
                System.out.println("not wrong! please, try again:\n katon, chidori or sharingan ?");
                jutsu = scanner.nextLine();
            }
        }
        return damage;
    }
}

