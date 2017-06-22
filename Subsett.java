import java.io.*;
import java.util.Scanner;
public class Subsett 
{
    public static void main(String args[])
    {
      // System.out.println("enter ar size");
       int i,j,count=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    //System.out.println("entr arr1");
    int arr1[]=new int[100];
    for(i=0;i<n;i++)
    arr1[i]=s.nextInt();
   
    //System.out.println("enter ar size");
   
    int m=s.nextInt();
    //System.out.println("entr arr1");
    int arr2[]=new int[100];
    for(j=0;j<m;j++)
    arr2[j]=s.nextInt();
    for(i=0;i<n;i++)
      for(j=0;j<m;j++)
      {  if(arr1[i]==arr2[j])
            {count++;
            }}
      if(count==n)
      {
                System.out.println("subset");
            }
    
    else
           {
               
           System.out.print("not subset");
    

    }}
}
