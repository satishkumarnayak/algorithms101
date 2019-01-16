package algorithms;

public class MergeSort2 {

	public static void main(String args[]) {
		
	}
	
	
	public void mergeSort(int[] arr) {
		//split
		
		int[] arr1 = new int[arr.length/2];
		int[] arr2 = new int[arr.length/2];
		
		for(int i = 0; i< arr.length/2;i++) {
			arr1[i]=arr[i];
		}
		for(int i = arr.length/2; i< arr.length;i++) {
			arr2[i]=arr[i];
		}
		
		//merge
		
		
	}
}
