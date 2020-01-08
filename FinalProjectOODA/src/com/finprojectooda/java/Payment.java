package com.finprojectooda.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Payment {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> Cash =new ArrayList<>(Arrays.asList(100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100));

    int temp;

    boolean Cash(int total) {
        int ammount;

        int paid = 0;
        for (int i = 0; i < Cash.size(); i++) {
            System.out.print("Ammount of " + Cash.get(i) + " : ");
            ammount = input.nextInt();
            paid += ammount * Cash.get(i);
        }

        int returned = paid - total;
        if (returned < 0) {
            //transaction failed
            return false;
        }

        while (returned > Cash.get((Cash.size()) - 1)) {
            System.out.println("Change : ");
            for (int i = 0; i < Cash.size(); i++) {
                ammount = 0;
                while (returned >= Cash.get(i)) {
                    ammount += 1;
                    returned -= Cash.get(i);
                }
                if (ammount != 0) {
                    System.out.println(Cash.get(i) + " : " + ammount + " Piece");
                }
            }
        }
        return false;
    }

    boolean Cashless(int total){
        System.out.println("Transaction success ? ");
        System.out.println("1. YES");
        System.out.println("2. NO");
        System.out.print("option : ");
        temp=input.nextInt();
        switch (temp){
            case 1:
                return false;
            case 2:
                return true;
        }
        return
    }
}