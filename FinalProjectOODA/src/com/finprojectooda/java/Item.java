package com.finprojectooda.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Item {
    Scanner input = new Scanner(System.in);

    static ArrayList<String> Item_ID = new ArrayList<>(Arrays.asList("TEST", "A0000001"));
    static ArrayList<String> Item_Name = new ArrayList<>(Arrays.asList("TEST", "Lay's Rumput Laut 68g"));
    static ArrayList<Integer> Item_Stock = new ArrayList<>(Arrays.asList(0, 10));
    static ArrayList<Integer> Item_Price = new ArrayList<>(Arrays.asList(0, 10000));

    void AddItem() {
        String item_id = Item_ID.get(0), item_name;
        int item_stock, item_price;

        while (Item_ID.contains(item_id)) {
            System.out.print("Item ID : ");
            item_id = input.next();
        }
        System.out.print("Item Name : ");
        item_name = input.next();
        System.out.print("Item stock : ");
        item_stock = input.nextInt();
        System.out.print("Item price : ");
        item_price = input.nextInt();

        Item_ID.add(item_id);
        Item_Name.add(item_name);
        Item_Stock.add(item_stock);
        Item_Price.add(item_price);
    }

    void EditItem() {
        System.out.println("List of item : ");
        for (int i = 1; i < Item_ID.size(); i++) {
            System.out.println(i + ". " + Item_ID.get(i) + " : " + Item_Name.get(i));
        }
        int option = input.nextInt();

        System.out.println("Item ID : " + Item_ID.get(option));
        System.out.println("Item Name : " + Item_Name.get(option));
        System.out.println("Item stock : " + Item_Stock.get(option));
        System.out.println("Item price : " + Item_Price.get(option));

        System.out.println("Which one do you want to change : ");
        System.out.println("1. Item ID");
        System.out.println("2. Item Name");
        System.out.println("3. Item stock");
        System.out.println("4. Item price");
        System.out.print("option : ");
        int option1 = input.nextInt();

        int temp;
        String tempo;

        if (option1 == 1) {
            System.out.println("New Item ID : ");
            tempo = input.next();
            Item_ID.set(option,tempo);
        } else if (option1 == 2) {
            System.out.println("New Item Name : ");
            tempo = input.next();
            Item_Name.set(option,tempo);
        } else if (option1 == 3) {
            System.out.println("New Item stock : ");
            temp = input.nextInt();
            Item_Stock.set(option,temp);
        } else if (option1 == 4) {
            System.out.println("New Item price : ");
            temp = input.nextInt();
            Item_Price.set(option,temp);
        }
    }

    boolean CheckItem(String item_id){ return Item_ID.contains(item_id); }

    int IndexItem(String item_id){ return Item_ID.indexOf(item_id); }

    String ItemName(int index){ return Item_Name.get(index); }
    int ItemPrice(int index){ return Item_Price.get(index); }

    void ReduceItem(String item_id,int ammount){
        int index=Item_ID.indexOf(item_id),currentStock=Item_Stock.get(index);
        Item_Stock.set(index,currentStock-ammount);
    }
}
