package algorithms;

public class BubbleSort2 {

	public static void main(String[] args) {
		BubbleSort2 sort = new BubbleSort2();
		int[] arr =  {5,4,4,2,5,9,3,2,1,0,3,79,32};
		for(int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("");
		System.out.println("Below Sorted");
	int[] bubbleSort = sort.bubbleSort(arr);
	for(int i : bubbleSort) {
		System.out.print(i + ",");
	}
		

	}
	
	public int[] bubbleSort(int[]  arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length;j++) {
			if(arr[i] > arr[j]) {
				int temp = 0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
			
		return arr;
	}

}
