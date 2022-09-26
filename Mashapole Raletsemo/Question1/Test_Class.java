
package Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test_Class 
{
    public static void main(String[] args)
    {
        /*
        I will solve the problem by firstly asking user to fill the Hash-Map
        */
        
        Scanner scan= new Scanner(System.in);
        int key;
        String value;
        HashMap<Integer,String> elements=new HashMap<>();
        while(true)
        {
            try
            {
             //ask for elemnts from user
             System.out.print("How many paired element you would like to enter into Hash-Map? ");
             int getElement=scan.nextInt();
             
             int count=1;
             for(int i=0;i<getElement;i++)
             {
                 System.out.print("\nPlease enter key for  "+count+"  :");
                 key=scan.nextInt();
                 System.out.print("Please enter value for  "+count+"  :");
                 value=scan.next();
                 
                 elements.put(key, value);
                 System.out.println("");
                 count++;
             }
             
             
             System.out.println("The Smallest Key is:  "+getSmallestKey(elements));
             int index=getSmallestKey(elements);
             
             //now lets remove the pair
             elements.remove(index);
             
             //display new collection
             System.out.println("*******************************************");
             System.out.println("-----REPORT WITH SMALLEST KEY REMOVED------");
             for(int i: elements.keySet())
             {
              System.out.println("Key: "+i+" "+" Value: "+elements.get(i));
             }
             System.out.println("*******************************************");
             break;
            }
            
            catch(Exception ex)
            {
                System.out.println("Error:"+ex.toString());
                continue;
            }
        }
    }

    private static int getSmallestKey(HashMap<Integer, String> elements) 
    {
        ArrayList<Integer> smallest= new ArrayList<>(elements.keySet());
        Collections.sort(smallest);
        
     return smallest.get(0);
    }
    
}
