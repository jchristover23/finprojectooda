package com.finprojectooda.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    Scanner input=new Scanner(System.in);
    ArrayList<String> Member_ID = new ArrayList<>(Arrays.asList("TEST","AAA0000001","JEREMY"));
    ArrayList<String> Member_Name = new ArrayList<>(Arrays.asList("TEST","LAURENS","JEREMY"));


    String CheckMember(String member_ID) {
        return Member_Name.get(Member_ID.indexOf(member_ID));
    }

    void AddMember(){
        String new_member_ID = input.next();
        Member_ID.add(new_member_ID);
        System.out.println("Member Has Been Successfully Created");
    }
}
