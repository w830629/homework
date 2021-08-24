package com.train;

import java.util.Scanner;

public class Ticket {
     int totaltickets;
     int roundtrip;



    public Ticket(int totaltickets ,int roundtrip){
        this.totaltickets = totaltickets;
        this.roundtrip = roundtrip;



    }
    public void show(){
        int total = (int)((totaltickets-roundtrip)*1000+(roundtrip*2000)*0.9);
        System.out.println("Total tickets:" + this.totaltickets+ "\n"
                +"Round-trip:" +this.roundtrip+"\n"
                +"Total:" +total);
    }
}





