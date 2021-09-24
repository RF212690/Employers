package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<String> employees= new ArrayList<String>();
        ArrayList<Float> hours= new ArrayList<Float>();
        ArrayList<Float> wages=new ArrayList<Float>();
        double hoursPay;

        while(true){
            System.out.println("what's the employee's name? ");
            employees.add(input.next());
            System.out.println("How many hours have they worked this week? ");
            hours.add(input.nextFloat());
            System.out.println("What is their hourly wage?");
            wages.add(input.nextFloat());

            System.out.println("Press n if you don't have any other employees");
            char response= input.next().charAt(0);
            if(response=='n' || response=='N'){
                break;
            }
        }
        for(int i=0; i<employees.size();i++){
            if(hours.get(i)>45){
                hoursPay=(hours.get(i)-45)*1.5+45;


            }
            else{
                hoursPay=hours.get(i);
            }
            System.out.println(employees.get(i)+"'s total amount of hours pay is: "+hoursPay);
            System.out.println("and he will get a total salary of "+hoursPay*wages.get(i));
            System.out.print("Which amounts to "+hoursPay*wages.get(i)*4/5+" with taxes");


        }





    }

}