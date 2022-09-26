
package Question2;

import java.util.ArrayList;
import java.util.Scanner;


public class Test_Class 
{
    public static ArrayList<Integer> numbers= new ArrayList<>();
    public static void main(String[]  args)
    {
        /*
        Based on this program, I will firstly ask user to fill the array list with numbers 
        */
        
        while(true)
        {
            try
            {
                Scanner scan=new Scanner(System.in);// libriary class for scanner 
                Methods_Holder.PrompCollectionValues(scan,numbers);//asking numbers
                System.out.println("");//breaking line
                Methods_Holder.Replace(scan, numbers);//replacing number
                System.out.println("");
                Methods_Holder.Display(scan,numbers);//displaying
                break;
            }
            catch(Exception ex)
            {
                System.out.println("Error:"+""+ex.toString());
                continue;
            }
        }
    }
}
