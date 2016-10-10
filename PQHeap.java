/**
 * @author pranatishrivastava
 *  The priority queue implemented here, uses heap datastructure algorithms from Introduction to Algorithms-Korman
 */
package finalpq;
public class PQHeap {

	/**Function to build a heap of the priority queue**/
	public static void BuildMaxHeap( Job[] arr) throws ArrayIndexOutOfBoundsException
	{
		for( int i = (int)Math.floor(arr.length); i >0; i-- )
			MaxHeapify( arr, i );
	}
	/**Function to heapify the priority queue**/
	public static void MaxHeapify(Job[] arr,int i)
	{
		Job temp = new Job();
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;


		if( left < arr.length && arr[ left ].priority > arr[ largest ].priority )
			largest = left;
		if( right < arr.length && arr[ right ].priority > arr[ largest ].priority )
			largest = right;
		
		/**This condition below comapres the count of occurrence of elements with same 
		 * priorities and enables STABLE priority queue implementation**/
		
		if(right < arr.length && arr[ right ].priority == arr[ largest ].priority ){
			int c1=arr[right].count;
			int c2=arr[largest].count;
			if(c1<c2){
				largest=right;
			}
		}
		/**This condition below comapres the count of occurrence of elements with same 
		 * priorities and enables STABLE priority queue implementation**/
		
		if(left < arr.length && arr[ left ].priority == arr[ largest ].priority ){
			int c3=arr[left].count;
			int c4=arr[largest].count;
			if(c3<c4){
				largest=left;
			}
		}
		if( largest != i )
		{
			temp = arr[ i ];
			arr[ i ] = arr[ largest ];
			arr[ largest ] = temp;

			MaxHeapify( arr, largest );
		}
	}

	/**Function to return maximum key in the Priority queue **/
	public static String HeapMaximum( Job[ ] arr)
	{
		System.out.println("Maximum key is:"+arr[0].priority);
		return arr[0].job;
	}

	/**Function to extract the maximum key element from the priority queue**/
	public static Job HeapExtractMaximum( Job[ ] arr){
		if(arr.length-1<1)
		{
			System.out.println("ERROR heap underflow");
		}
		Job max;
		max = arr[0];
		arr[0]=arr[arr.length-1];//check if this needs -1
		MaxHeapify(arr, 0);
		//System.out.println("Maximum key is:"+arr[0].priority);
		return max;

	}


}