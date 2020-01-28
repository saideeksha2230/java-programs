import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x <0)
        {
            System.out.println("x is negitive");
        }
        else
        {
            System.out.println("x is positive");
        }
    }
}