package com.YarikTask.Desktop;

import java.util.Random;
import java.util.Scanner;

public class Saske extends Ninja {
    public Double getDamage() {
        return damage;
    }

    private Double damage;

    public Saske(Double chakra, Double health) {
        super(chakra, health);
    }

    Scanner scanner = new Scanner(System.in);


    public double[] sharingan() {
        Random random = new Random();
        double damage = 400 + (100 * random.nextDouble()); // Случайное значение в диапазоне от __ до __
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

    public double atack() throws InterruptedException {
        while (true) {
            if (chakra <= 300 && health <= 300 ) {
                System.out.println("Activating Saske's Cursed Seal");
                Thread.sleep(1000);
                health = 1500d;
                chakra = 2000d;
                System.out.println("SASKE IS USED <<Cursed Seal>> \n SASKE HEALTH = " + health + "\nSASKE CHAKRA = " + chakra);
                break;
            } else {
                break;
            }
        }
        System.out.println("Please, enter name jutsu for atack : \n 1. CHIDORI \n 2.KATON \n 3. SHARINGAN ?");
        String jutsu = scanner.nextLine();
        while (true) {
            if (jutsu.equalsIgnoreCase("chidori ") || jutsu.equals(String.valueOf(1))) {
                double[] chidoriResult = chidori();
                double chakraСonsumption = chidoriResult[0];
                double fixedValue = chidoriResult[1];
                if (chakra >= 200) {
                    chakra -= fixedValue;
                    System.out.println("Used chidori! Damage: " + chakraСonsumption + ", Fixed Value: " + fixedValue + ", Remaining chakra: " + chakra);
                    Thread.sleep(1000);
                    damage = chakraСonsumption;
                    break;
                } else {
                    System.out.println("Nooo, you chakra is gone!");
                }
            } else if (jutsu.equalsIgnoreCase("katon") || jutsu.equals(String.valueOf(2))) {
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
            } else if (jutsu.equalsIgnoreCase("sharingan") || jutsu.equals(String.valueOf(3))) {
                double[] sharinganResult = sharingan();
                double chakraСonsumption = sharinganResult[0];
                double fixedValue = sharinganResult[1];
                if (chakra >= 200) {
                    chakra -= fixedValue;
                    System.out.println("Used sharingan! Damage: " + chakraСonsumption + ", Fixed Value: " + fixedValue + ", Remaining chakra: " + chakra);
                    Thread.sleep(1000);
                    damage = chakraСonsumption;
                    break;
                } else {
                    System.out.println("Nooo, you chakra is gone! ");
                }
            } else {
                System.out.println("wrong! please, try again:\n katon, chidori or sharingan ?");
                jutsu = scanner.nextLine();
            }
        }
        return damage;
    }
}

