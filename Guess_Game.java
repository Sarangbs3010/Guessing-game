package com.company;
import java.util.Random;
import java.util.Scanner;
public class Constructors {
    static void game() {
        Random ran=new Random();
        int b=ran.nextInt(0,100);
        Guess obj=new Guess();
        int done=0;
        while(done==0)
        {
            int a= obj.guess();
            if(a==b)
            {
                System.out.println("Yes you are right");
                System.out.println("The number is "+b+"");
                done=1;
            }
            else if(a>b)
            {
                System.out.println("Choose a Smaller Number");
            }
            else{
                System.out.println("Choose a Bigger Number");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game");
        game();
    }
}
class Guess
{
    public int guess()
    {
        System.out.println("Whats your Guess:");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        return a;
    }
}