package com.finprojectooda.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Item item = new Item();
        Modifier modifier = new Modifier();
        Payment payment = new Payment();

        int temp;
        String tempo;
        boolean notPaid;

        Scanner input = new Scanner(System.in);
        int optionMenu = 0;

        while (optionMenu != 5) {
            System.out.println("============ MENU ============");
            System.out.println("1. Create Membership");
            System.out.println("2. Add Item");
            System.out.println("3. Edit Item");
            System.out.println("4. Sales");
            System.out.println("5. Exit");
            System.out.print("option : ");
            optionMenu = input.nextInt();

            if (optionMenu == 1) {
                customer.AddMember();
            } else if (optionMenu == 2) {
                item.AddItem();
            } else if (optionMenu == 3) {
                item.EditItem();
            } else if (optionMenu == 4) {
                int optionSales,memberstatus,discount=0,subtotal,index;
                ArrayList<String> Cart = new ArrayList<>();
                ArrayList<Integer> Ammount = new ArrayList<>();

                System.out.println("Using member ? ");
                System.out.println("1. YES");
                System.out.println("2. NO");
                System.out.print("option : ");
                memberstatus = input.nextInt();
                if (memberstatus == 1) {
                    System.out.print("Input Member ID : ");
                    temp = input.nextInt();
                    String Membername = customer.CheckMember(temp);
                    System.out.println("==============================");
                    System.out.println("WELLCOME BACK : "+ Membername);
                    discount+=2;
                }else {
                    System.out.println("==============================");
                    System.out.println("WELLCOME");
                }

                while (true){
                    System.out.println("==============================");
                    System.out.println("1. Add item to cart");
                    System.out.println("2. Remove item from cart");
                    System.out.println("3. View chart");
                    System.out.println("4. Finish cart");
                    System.out.print("option : ");
                    optionSales=input.nextInt();

                    if (optionSales==1){
                        while (true) {
                            System.out.print("Input item ID : ");
                            tempo = input.next();
                            if (item.CheckItem(tempo)){
                                System.out.print("Input item ammount : ");
                                temp=input.nextInt();
                                if (temp>0){
                                    if (Cart.contains(tempo)){
                                        index=Cart.indexOf(tempo);
                                        Ammount.set(index,Ammount.get(index)+temp);
                                    } else {
                                        Cart.add(tempo);
                                        Ammount.add(temp);
                                    }
                                }
                            }
                        }

                    }else if (optionSales==2){
                        System.out.print("Input item ID to remove : ");
                        tempo = input.next();
                        index=Cart.indexOf(tempo);
                        Cart.remove(index);
                        Ammount.remove(index);
                    }else if (optionSales==3){
                        subtotal=0;
                        for (int i = 0; i < Cart.size(); i++) {
                            index = item.IndexItem(Cart.get(i));
                            System.out.println(item.ItemName(index)+" : "+ item.ItemPrice(index));
                            System.out.println("x"+Ammount.get(i)+" = "+(Ammount.get(i)*item.ItemPrice(index)));
                            subtotal+=Ammount.get(i)*item.ItemPrice(index);
                        }
                        System.out.println("Subtotal : RP."+subtotal);

                    }else if (optionSales==4){
                        subtotal=0;
                        int total;
                        for (int i = 0; i < Cart.size(); i++) {
                            index = item.IndexItem(Cart.get(i));
                            System.out.println(item.ItemName(index)+" : "+ item.ItemPrice(index));
                            System.out.println("x"+Ammount.get(i)+" = "+Ammount.get(i)*item.ItemPrice(index));
                            subtotal+=Ammount.get(i)*item.ItemPrice(index);
                        }

                        System.out.println("Subtotal : Rp."+subtotal);
                        System.out.println("Discount : "+discount+"%");
                        subtotal=modifier.Discount(subtotal,discount);
                        System.out.println("Subtotal : Rp."+subtotal);
                        total=modifier.Tax(subtotal);
                        System.out.println("Tax : 10%");
                        System.out.println("Total : Rp."+total);
                        System.out.println("==============================");

                        notPaid = true;

                        while (notPaid) {
                            System.out.println("Payment Method : ");
                            System.out.println("1. Cashless");
                            System.out.println("2. Cash");
                            System.out.print("option : ");
                            temp = input.nextInt();
                            switch (temp) {
                                case 1:
                                    notPaid=payment.Cashless(total);
                                case 2:
                                    notPaid=payment.Cash(total);
                            }
                        }
                        for (int i = 0; i < Cart.size(); i++) {
                            item.ReduceItem(Cart.get(i),Ammount.get(i));
                        }
                        Cart.clear();
                        Ammount.clear();
                    }
                }
            }
        }
    }
}

