package moshPractice;

public class Array {
	
	private int[] arr;
	private int count;
	
	Array(int length){
		arr = new int[length];
	}
	
	public void insert(int n) {
		if(arr.length == count) {
			int[] arr2 = new int[count * 2];
			
			for(int i=0; i<count; i++) {
				arr2[i] = arr[i];
			}
			
			arr = arr2;
		}
		
		arr[count++] = n;
	}
	
	public void removeAt(int pos) {
		if(pos < 0 || pos >= count) { 
			System.out.println(-1);
		}
		
		for(int i=pos; i<count; i++) {
			arr[i] = arr[i+1];
		}
		
		count--;
	}
	
	public int indexOf(int n) {
		for(int i=0; i<count; i++) {
			if(arr[i] == n) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
