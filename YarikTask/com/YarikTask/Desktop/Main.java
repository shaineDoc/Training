package com.YarikTask.Desktop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Saske saske = new Saske(700.00, 600d);
        Gaara gaara = new Gaara(1000.00, 400d);
        saske.atack();
        gaara.health -= saske.getDamage();
        Thread.sleep(500);
        System.out.println("oops! Gaara  takes damage in " + saske.getDamage() + "\n");
        if (gaara.health < 400d && gaara.health > 300) {
            gaara.somthing();
            gaara.health += gaara.somthing();
            System.out.println("Gaara apply <Suna no Tate> and partially dodged the attack. \n" + " Gaara health = " + gaara.health);
            Thread.sleep(500);
        } else if (gaara.health < 300) {
            gaara.rage();
            saske.health -= (gaara.getDamage()*2);
            System.out.println("Saske takes critical damage " + gaara.getDamage()*2 + "\n Saske HP = " + saske.health);
            Thread.sleep(500);
        }
        if (gaara.health == 3000) {
            System.out.println("Gaara gets a turn pass due to Rage activation \n Saske, you turn");
            Thread.sleep(500);
            saske.atack();
            if (saske.getDamage() >= 400 ) {
                System.out.println("Critical hit! The enemy is stunned");
                Thread.sleep(500);
                saske.atack();
            } else {
                System.out.println("Gaara  takes damage " + saske.getDamage());
                Thread.sleep(500);
            }
        }

    }
}

