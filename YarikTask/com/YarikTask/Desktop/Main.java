package com.YarikTask.Desktop;

import java.util.Random;
import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
       Saske saske = new Saske(1000.00, 900d);
        Gaara gaara = new Gaara(1000.00, 400d);
        saske.atack();
        gaara.health -= saske.damage;
        System.out.println("oops! Gaara  takes damage in " + saske.damage + "\n");
        if (gaara.health < 400d && gaara.health > 300) {
            gaara.somthing();
            gaara.health += gaara.somthing();
            System.out.println("Gaara apply <Suna no Tate> and partially dodged the attack. \n");
        } else if (gaara.health < 300) {
            gaara.rage();
            saske.health -= (gaara.damage*2);
            System.out.println("Saske takes critical damage " + gaara.damage*2 + "\n Saske HP = " + saske.health);
        }

    }
}

