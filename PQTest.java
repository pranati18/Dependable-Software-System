/**
 * @author pranatishrivastava
 *  The priority queue implemented here, uses heap datastructure algorithms from Introduction to Algorithms-Korman
 *  FindBugs report: Currently, no bugs found
 */

package finalpq;

import java.util.Scanner;
 
public class PQTest {
	/*static int number;
	static Job jarray[]=new Job[number];*/
	
	/** function to insert job **/
    public static Job insert(String job, int priority, int count)
    {
        Job newJob = new Job(job, priority,count);
        
           return newJob;
    }
   /* public static void print()
    {
    	System.out.println("entered elements are:");
    	   for(Job i: jarray){ //for printing array

    	       System.out.println(i);

    	   }*/
    
    
	public static void main(String[] args){
		
	System.out.println("Stable Priority queue implementation");
	//PQHeap pqheap=new PQHeap();
	
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter number of elements to be entered in the priority queue:");

    int number=reader.nextInt();
    Job jarray[]=new Job[number];
   // Job temp= new Job();
    
    System.out.println("Enter job name and its respective priority keys(e.g: job1 20):");
    for(int i=0;i<number;i++){//for reading array
       	jarray[i]=insert(reader.next(), reader.nextInt(),i);
       }
   
    
    
   PQHeap.BuildMaxHeap(jarray);
  // print();
   System.out.println("entered elements are:");
   for(Job i: jarray){ //for printing array

       System.out.println(i);
       
   }
   int choice;
   do{
	   System.out.println("\nSelect one of the options from below:");
	   System.out.println("1. Insert into Priority queue\n");
	   System.out.println("2. Display the job with maximum priority\n");
	   System.out.println("3. Remove the job with the highest priority from the queue\n");
	   System.out.println("4. Quit program");
	   choice=reader.nextInt();
   switch (choice) 
   {
   case 1 : 
	   System.out.println("Enter number of elements to be entered in the priority queue:");

	    number=reader.nextInt();
	   
	    System.out.println("Enter job name and its respective priority keys (e.g: job1 40):");
	    for(int j=0;j<number;j++){//for reading array
	       	jarray[j]=insert(reader.next(), reader.nextInt(),j);
	       }
	   
	   PQHeap.BuildMaxHeap(jarray);
	  // print();        
       break;                          
   case 2 : 
	   String max= PQHeap.HeapMaximum(jarray);
		System.out.println("Highest priority element in the queue: "+max);
       break;        
   case 3 : 
	   Job exmax= PQHeap.HeapExtractMaximum(jarray);
	   System.out.println("Extracted element with highest priority element in the queue: "+exmax);
	   String max1= PQHeap.HeapMaximum(jarray);
	   System.out.println("Job with highest priority in the queue now is: "+max1);
       break; 
   case 4 : 
       System.exit(0);
       break;      
   default : 
       System.out.println("Please Enter a valid choice \n");
       break;   
   } 
   }
   while(choice<4 && choice>0);
   
  
   
   
  reader.close();


   }
}
	
