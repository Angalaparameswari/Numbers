import java.io.*;
importjava.util.*;
class Posneg
{
  public Static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n>0)
    { 
      System.out.println("Positive Integer");
    }
    else if(n<0)
    {
      System.out.println("Negative Integer");
    }
    else
      System.out.println("Integer is zero");
  }
}
