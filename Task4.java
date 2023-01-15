package Homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is your age ?");
        int age= input.nextInt();

        if(age>=18){
            System.out.println(" yes you are eligible to get a driver license");

        }else{
            System.out.println("you can apply for a learners permit");
        }
    }
}
