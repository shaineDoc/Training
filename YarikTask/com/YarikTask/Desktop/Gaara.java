package com.YarikTask.Desktop;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class Gaara extends Ninja {
    public Gaara(Double chakra, Double health) {
        super(chakra, health);

    }

   private Double regenerate;
   private Double damage;


    public Double getDamage() {
        return damage;
    }

    public double[] sunaShuriken() {
        Random random = new Random();
        double damage = 30 + (100 * random.nextDouble());
        double fixedValueChakra = 100.50;
        return new double[]{
                damage, fixedValueChakra
        };
    }



    private double[] sunaNoKaivan() {
        Random random = new Random();
        double rageAtack = 250 + (random.nextDouble() * 3);
        double fixUsedChakra = 30 + (100 / random.nextDouble());
        return new double[]{
                rageAtack, fixUsedChakra
        };
    }



    public double[] sunaNoTate() {
        Random random = new Random();
        double regenerateHealthIsAtack = 50 + (100 * random.nextDouble());
        double fixedValueChakra = 300d;
        return new double[]{
                fixedValueChakra, regenerateHealthIsAtack};
    }

    public double somthing() {
        if (health < 400) {
            double[] usedSunaNoTate = sunaNoTate();
            regenerate = usedSunaNoTate[1];
        }
        return regenerate;
    }

    public double rage() throws InterruptedException {
        System.out.println(" Oh no, Gaara gose into a rage\n " + "! Damage increased by 2 !".toUpperCase());
        Thread.sleep(500);
        Random myRand = new Random();
        shikaku();
        System.out.println("HP Gaara is increased to "+ health );
        Thread.sleep(500);
        double randomInteger = myRand.nextInt(2);
        if (randomInteger == 0) {
            double[] rageSunaShuriken = sunaShuriken();// атака 1
            damage = rageSunaShuriken[0] * 2;
            chakra -= rageSunaShuriken[1];
            System.out.println("shikaku broke out of Gaara and Atack! \n unbelievably ! is atack  " + damage);
            Thread.sleep(500);
        } else if (randomInteger == 1) {
            double[]rageSuna = sunaNoKaivan();
            damage = rageSuna[0];
            chakra -= rageSuna[1];
            System.out.println("shikaku broke out of Gaara and Atack! \n unbelievably ! is atack  " + damage);
            Thread.sleep(500);
        }
    return damage;

    }

    public void shikaku() {
        health = 3000d;
    }

}


