
package Question3;

import java.util.LinkedList;
import java.util.Scanner;


public class Test_Class 
{
    public static LinkedList<Integer> collection1= new LinkedList<>();
    public static LinkedList<Integer> collection2= new LinkedList<>();
    
    public static void main(String[] args)
    {
        /*
        Based on the problem, i will firstly ask the user to fill the two Linked List 
        */
        
        while(true)
        {
            try
            {
                Scanner scan= new Scanner(System.in);
                Methods_Holder.FillListOne(scan, collection1);//method for filling first collection
                System.out.println("");
                Methods_Holder.FillListTwo(scan, collection2);//method for filling second collection
                System.out.println("");
                Methods_Holder.DisplayBothCollections(collection1, collection2);//method for displaying noth collection
                System.out.println("");
                Methods_Holder.Join(scan,collection1, collection2); //method for joining and desplaying new merged collection
                break;
            }
            catch(Exception ex)
            {
                System.out.println("Error:"+ex.toString());
                continue;
            }
        }

    }
}

