import java.io.*;
import java.util.Scanner;
public class Main1 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int temp,sum=0,r;
      temp=n;
      while(n>0)
      {
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
      }

      if(temp==sum)
      {
          System.out.println("n is a pallindrome");
      }
      else
      System.out.println("n is not a pallindrome");
    }
}