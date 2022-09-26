package Question3;

import java.util.LinkedList;
import java.util.Scanner;


public class Methods_Holder 
{

    public static void FillListOne(Scanner scan, LinkedList<Integer> collection1) 
    {
        System.out.println("***************************************************");
        System.out.println("-----------ADDING NUMBERS TO COLLECTION 1------------");
        System.out.println("How many numbers you would like to fill into Linked List One? ");
        int num=scan.nextInt();
        
        int count=1;
        for(int i=0;i<num;i++)
        {
            System.out.print("Please enter number "+count+"  :");
            collection1.add(scan.nextInt());
            count++;
        }
        System.out.println("Numbers succesfully entered");
    }

    public static void FillListTwo(Scanner scan, LinkedList<Integer> collection2) 
    {
        System.out.println("***************************************************");
        System.out.println("-----------ADDING NUMBERS TO COLLECTION 2------------");
        System.out.println("How many numbers you would like to fill into Linked List Two? ");
        int num=scan.nextInt();
        
        int count=1;
        for(int i=0;i<num;i++)
        {
            System.out.print("Please enter number "+count+"  :");
            collection2.add(scan.nextInt());
            count++;
        }
        System.out.println("Numbers succesfully entered");
    }

    public static void DisplayBothCollections(LinkedList<Integer> collection1, LinkedList<Integer> collection2) 
    {
        System.out.println("***************************************************");
        System.out.println("-----------DISPLAY FOR BOTH COLLECTION-------------");
        
        String coll1="",coll2="";
        
        for(int i: collection1)
        {
           coll1+=i+" "; 
        }
        for(int i: collection2)
        {
           coll2+=i+" "; 
        }
        System.out.println("First Cllection:  "+coll1);
        System.out.println("Second Cllection:  "+coll2);
    }

    public static void Join(Scanner scan, LinkedList<Integer> collection1, LinkedList<Integer> collection2) 
    {   
        while(true)
        {
            try
            {
                LinkedList<Integer> joined= new LinkedList<>(); 
                System.out.println("***************************************************");
                System.out.println("--------------MERGING LINKED LIST------------------");
                System.out.println("Enter the element where you want to start merging the two LinkedList :");
                int element=scan.nextInt();

                int size=collection1.size();
     
                //checking if the collectiong size is greater than the given element
                if(size>element)
                {
                    //looping numbers until given index
                    for(int i=0;i<element;i++)
                    {
                        //adding numbers until given index into new linkedList
                        joined.add(collection1.get(i));
                    }
                    //adding collection2 to the new collection the way it is
                    joined.addAll(collection2);

                    //looping the remainder from first collection
                    for(int i=element;i<collection1.size();i++)
                    {
                        //adding the remainer numbers to collection
                       joined.add(collection1.get(i)); 
                    }
                    System.out.println("Successfuly Merged!");  


                    System.out.println("\n");
                    //variable to store number and comma
                    String hold="";
                    //looping the entire linked list
                    for(int i: joined)
                    {
                        hold+=i+",";// concatinating number with comma
                    }
                    System.out.println("Results: "+hold.substring(0,hold.length()-1));// display the values and remove last comma
                    break;  
                    }
                
            }
            catch(Exception ex)
            {
                System.out.println("Error:"+ex.toString());
                continue;
            }
        }
        
        
    }
    
}
