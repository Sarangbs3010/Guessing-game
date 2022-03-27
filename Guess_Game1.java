package com.company;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int done=0;
        int count=0;
        Game obj=new Game();
        int a=obj.rand;
        int b=0;
        b=obj.Takeuserput(b);
        if(a==b)
        {
            count=obj.getCount();
            System.out.println("Yes you are right");
            System.out.println("Number of Guesses is "+count+"");
        }
        else if(a>b)
        {
            System.out.println("Choose a greater number");
            while(done!=1)
            {
                System.out.println("1. Wish to Continue\t2.Exit");
                System.out.println("Enter your Choice:");
                int choice=in.nextInt();
                switch (choice)
                {
                    case 1:
                        count=obj.getCount();
                        b=obj.Takeuserput(b);
                        if(a==b)
                        {

                            System.out.println("Your guess "+b+"");
                            System.out.println("System number "+a+"");
                            System.out.println("Yes you are right");

                        }
                        else if(a>b)
                        {
                            System.out.println("Choose a greater number");
                            continue;
                        }
                        else
                        {
                            System.out.println("Choose a smaller number");
                            continue;
                        }
                        break;
                    case 2:
                        done=1;
                        System.out.println("Better luck next time");
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
                System.out.println("Number of Guesses is "+count+"");
            }
        }
        else
        {
            System.out.println("Choose a smaller number");
            while(done!=1)
            {
                System.out.println("1. Wish to Continue\t2.Exit");
                System.out.println("Enter your Choice:");
                int choice=in.nextInt();
                switch (choice)
                {
                    case 1:
                        count=obj.getCount();
                        b=obj.Takeuserput(b);
                        if(a==b)
                        {

                            System.out.println("Your guess "+b+"");
                            System.out.println("System number "+a+"");
                            System.out.println("Yes you are right");

                        }
                        else if(a>b)
                        {
                            System.out.println("Choose a greater number");
                            continue;
                        }
                        else
                        {
                            System.out.println("Choose a smaller number");
                            continue;
                        }
                        break;
                    case 2:
                        done=1;
                        System.out.println("Better luck next time");
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
                System.out.println("Number of Guesses is "+count+"");
            }
        }
    }
}
class Game
{
    private int count=0;
    public int rand=0;
    public int getCount() {
        count++;
        return count;
    }
    public Game()
    {
        Random ran=new Random();
         rand= ran.nextInt(0,100);
    }
    public int Takeuserput(int a)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Guess:");
        a= in.nextInt();
        return a;
    }
    public void isCorrectnumber(int a,int b)
    {
        if(a==b)
        {
            System.out.println("The Guess is Correct");
        }
        else
        {
            System.out.println("Try Again");
        }
    }
}

