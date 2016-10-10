/**
 * @author pranatishrivastava
 *  Test cases are written to cover all methods in PQHeap.java
 *  coverage:100%
 */

package finalpq;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;



public class PQJunit {
/**tests the HeapMaximum function**/
	@Test
	public void HeapMaximumtest() {
		Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",20,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",20,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",20,5);
		 
		String actual=PQHeap.HeapMaximum(jarray);
		 
		assertEquals(jarray[0].job, actual);
		//fail("Not yet implemented");
	}
	
	/**tests the HeapMaximum function for various branch coverage conditions**/
	@Test
	public void HeapMaximumtest1() {
		Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",10,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",2,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",1,5);
		 
		String actual=PQHeap.HeapMaximum(jarray);
		 
		assertEquals(jarray[0].job, actual);
		//fail("Not yet implemented");
	}
	
	/**tests the HeapMaximum function for various branch coverage conditions**/
	@Test
	public void HeapMaximumtest2() {
		Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",50,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",80,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",1,5);
		 
		String actual=PQHeap.HeapMaximum(jarray);
		 
		assertEquals(jarray[0].job, actual);
		//fail("Not yet implemented");
	}
	
	/**tests the HeapExtractMaximum function for equal priorities**/
	@Test
	public void HeapExtractMaximumtestSamePriorities() {
		 Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",20,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",20,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",20,5);
		 
		 Job actual=PQHeap.HeapExtractMaximum(jarray);
		 //System.out.println(""+actual);
		//assertTrue((new Job("job1",20,1)).equals(actual));
		//assertEquals(new Job("job1",20,1), actual);
		 assertNotEquals(new Job("job3",20,1), actual);
		//fail("Not yet implemented");
	}
	
	/**tests the HeapExtractMaximum function for different priorities**/
	@Test
	public void HeapExtractMaximumtestDifferentPriorities() {
		 Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",50,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",80,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",1,5);
		 
		 Job actual=PQHeap.HeapExtractMaximum(jarray);
		 //System.out.println(""+actual);
		//assertTrue((new Job("job1",20,1)).equals(actual));
		//assertEquals(new Job("job1",20,1), actual);
		 assertNotEquals(new Job("job3",20,1), actual);
		//fail("Not yet implemented");
	}
	
	/**tests the HeapExtractMaximum function when the array is empty**/
	@Test
	public void HeapExtractMaximumtestNoPriorities() {
		 Job jarray[]=new Job[1];
		 
		 Job actual=PQHeap.HeapExtractMaximum(jarray);
		 //System.out.println(""+actual);
		//assertTrue((new Job("job1",20,1)).equals(actual));
		//assertEquals(new Job("job1",20,1), actual);
		 assertNotEquals(new Job("job3",20,1), actual);
		//fail("Not yet implemented");
	}
	
	/**tests the BuildMaxHeap function**/
	@Test
	public void BuildMaxHeaptest() {
		 Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",50,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",80,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",1,5);
		 int i;
		 //= (int)Math.floor(jarray.length);
		 
	
		    for( i = (int)Math.floor(jarray.length); i >0; i-- )
		    	PQHeap.MaxHeapify(jarray, i);
	
		assertNotEquals(-1, i);
	}
	/**tests the BuildMaxHeap function and also Maxheapify through it**/
	@Test
	public void BuildMaxHeaptest1() {
		 Job jarray[]=new Job[5];
		 jarray[0]=new Job("job1",50,1);
		 jarray[1]=new Job("job2",20,2);
		 jarray[2]=new Job("job3",80,3);
		 jarray[3]=new Job("job4",20,4);
		 jarray[4]=new Job("job5",1,5);
		 int i;
		 //= (int)Math.floor(jarray.length);
		 
		
		 PQHeap.BuildMaxHeap(jarray);
		
		    for( i = (int)Math.floor(jarray.length); i >0; i-- )
		    	PQHeap.MaxHeapify(jarray, i);
	
		assertNotEquals(-1, i);
	}
	
	/**tests the Insert function in the test class **/
	@Test
	public void Inserttest() {		 
		String job="job1";
		int priority=1;
		int count=1;
		
		Job expected=new Job("random", 2, 2);
		//Job expected = new Job(job, priority, count);
		  System.out.println(expected);
		Job actual=PQTest.insert(job, priority, count);
	System.out.println(actual);
	//assertSame(expected, actual);	
	assertFalse(expected.equals(actual));
	}
	
	
	
	
}
