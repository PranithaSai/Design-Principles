package com.epam.designprinciples;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which operation u want to perfom");
        System.out.println("1.- 2.+ 3.*  4./");
        int o = sc.nextInt();
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (o){
            case 1:
            	Subtraction s = new Subtraction();
                s.sub(a,b);
                break;
            case 2:
                Addition ad = new Addition();
                ad.add(a,b);
                break;
            case 3:
                Multiplication m = new Multiplication();
                m.mul(a,b);
                break;
            case 4:
                Division d = new Division();
                d.div(a,b);
                break;
               
        }
        sc.close();
      
    }

}
