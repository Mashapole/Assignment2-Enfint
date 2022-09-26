
package Question2;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods_Holder 
{

   public static void PrompCollectionValues(Scanner scan, ArrayList<Integer> numbers) 
    {
        System.out.println("***************************************************");
        System.out.println("-----------ADDING NUMBERS TO COLLECTION------------");
        System.out.println("How many numbers you would like to fill into arrayList? ");
        int num=scan.nextInt();
        
        int count=1;
        for(int i=0;i<num;i++)
        {
            System.out.print("Please enter number "+count+"  :");
            numbers.add(scan.nextInt());
            count++;
        }
        System.out.println("Numbers succesfully entered");
    }

    public static void Replace(Scanner scan, ArrayList<Integer> numbers) 
    {
        int element=0;
        int newNumber=0;
        
        System.out.println("***************************************************");
        System.out.println("----------REPLACING ELEMENT WITH NEW VALUE---------");
        
        System.out.println("Please enter the number of element to replace : ");
        element=scan.nextInt();
        System.out.println("Please enter the new value to replace with :");
        newNumber=scan.nextInt();
       
        numbers.set(element, newNumber);
        System.out.println("Succesfully Replaced!");

    }  

    public static void Display(Scanner scan, ArrayList<Integer> numbers) 
    {
        System.out.println("***************************************************");
        System.out.println("------------------FINAL REPORT---------------------");
        int count=0;
        for(int i: numbers)
        {
          System.out.println("Index:  "+count+"  "+"Number  :"+i);
          count++;
        }
        System.out.println("***************************************************");
        System.out.println("------------------END------------------------------");
    }
}
