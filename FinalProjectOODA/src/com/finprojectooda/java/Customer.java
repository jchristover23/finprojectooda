package com.finprojectooda.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    Scanner input=new Scanner(System.in);
    ArrayList<Integer> Member_ID = new ArrayList<>(Arrays.asList(0,1,2));
    ArrayList<String> Member_Name = new ArrayList<>(Arrays.asList("TEST","LAURENS","JEREMY"));


    String CheckMember(int member_ID) {
        return Member_Name.get(Member_ID.indexOf(member_ID));
    }

    void AddMember(){
        System.out.print("Input Member Name : ");
        String new_member_name = input.next();
        int new_member_id=Member_ID.size();
        Member_ID.add(new_member_id);
        Member_Name.add(new_member_name);
        System.out.println("Member Has Been Successfully Created with ID : "+new_member_id);
    }
}
