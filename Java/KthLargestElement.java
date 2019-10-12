import java.util.* ;

public class MinHeapToFindKthLargestElement {

	public static int findKthLargest(List<Integer> nums,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums.subList(0,k)) ;
		
		for(int i=k ; i<nums.size() ; i++) {
			if(nums.get(i)>pq.peek()) {
				pq.poll() ;
				pq.add(nums.get(i)) ;
			}
		}
		
		return pq.peek() ;
	}
	public static int findKthSmallest(List<Integer> nums,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums) ;
		while(--k>0) {
			pq.poll() ;
		}
		
		return pq.peek() ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(7,3,9,12,76,5,34,10) ;
		// 3 5 7 9 10 12 34 76
		int k=5 ;
		
		System.out.println("Kth Largest element in the array is "+findKthLargest(nums,k)) ;
		System.out.println("Kth Smallest element in the array is "+findKthSmallest(nums,k)) ;
	}

}
